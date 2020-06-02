package com.yonyou.iuap.corp.demo.web;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiJsApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 描述:
 *
 * @author mantan
 * @create 2019-05-14 下午8:52
 */
@Controller
@RequestMapping("/")
public class JsBridgeDemoController {

    @Autowired
    private ApiJsApiService apiJsApiService;

    @Autowired
    private ApiAccessTokenService apiAccessTokenService;


    @GetMapping("/jsdemo")
    public String jsdemo(Model model) throws Exception {
        Map<String, Object> param = apiJsApiService.getAgentInfo(apiAccessTokenService.getAccessToken());
        model.addAttribute("agentId", param.get("agentId"));
        model.addAttribute("timeStamp", param.get("timeStamp"));
        model.addAttribute("signature", param.get("signature"));
        return "index";
    }

}

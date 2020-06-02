package com.yonyou.iuap.corp.demo.web;


import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.approve.center.ApproveCenterService;
import com.yonyou.iuap.corp.demo.entity.yonbip.approve.center.ApproveCenterEntity;
import com.yonyou.iuap.corp.demo.utils.JsonUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: corp-demo
 * @description: 审批中心测试服务
 * @author: kw
 * @create: 2020/04/16 14:25
 */
@RestController
@RequestMapping("/")
public class ApproveCenterController {

    @Autowired
    private ApproveCenterService approveCenterService;

    @Autowired
    private ApiAccessTokenService apiAccessTokenService;

    @RequestMapping("approveCenter")
    public JSONObject handleApproveCenter(@RequestParam(required=false) String code,
                                          @RequestParam(required=false) String lang,
                                          @RequestParam(required=false) String fromSys,
                                          @RequestParam(required=false) String app_id,
                                          @RequestBody String requstBody) throws Exception {
        JSONObject json = JsonUtil.strToJson(requstBody);
        return approveCenterService.handleAction(apiAccessTokenService.getAccessToken(),json);
    }

    @RequestMapping("approveCenter2")
    public JSONObject handleApproveCenter2(@RequestParam(required=false) String code,
                                          @RequestParam(required=false) String lang,
                                          @RequestParam(required=false) String fromSys,
                                          @RequestParam(required=false) String app_id,
                                          @RequestBody ApproveCenterEntity approveCenterEntity) throws Exception {
        return approveCenterService.handleAction2(apiAccessTokenService.getAccessToken(),approveCenterEntity);
    }
}

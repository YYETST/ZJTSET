package com.yonyou.iuap.corp.demo.web;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.AccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.approve.center.ApproveCenterService;
import com.yonyou.iuap.corp.demo.entity.yonbip.approve.center.ApproveCenterEntity;
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
    private AccessTokenService accessTokenService;

    @RequestMapping("approveCenter")
    public JSONObject handleApproveCenter(@RequestParam(required=false) String code, @RequestBody ApproveCenterEntity approveCenterEntity) throws Exception {
        return approveCenterService.handleAction(accessTokenService.getAccessToken(),approveCenterEntity);
    }
}

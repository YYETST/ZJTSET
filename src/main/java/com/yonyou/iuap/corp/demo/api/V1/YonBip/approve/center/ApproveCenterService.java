package com.yonyou.iuap.corp.demo.api.V1.YonBip.approve.center;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiJobService;
import com.yonyou.iuap.corp.demo.entity.yonbip.approve.center.ApproveCenterEntity;
import com.yonyou.iuap.corp.demo.utils.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: corp-demo
 * @description: 审批中心相关业务处理
 * @author: kw
 * @create: 2020/04/16 14:56
 */
@Service
public class ApproveCenterService {

    private static final Logger logger = LoggerFactory.getLogger(ApproveCenterService.class);

    /**
     * @description:  根据不同action返回不同结果
     * @author: kw
     * @date: 2020/4/16
     * @param: [accessToken, approveCenterEntity]
     * @return: com.alibaba.fastjson.JSONObject
     */
    public JSONObject handleAction(String accessToken, ApproveCenterEntity approveCenterEntity) {
        logger.info("请求参数："+JSON.toJSONString(approveCenterEntity));
        String action = approveCenterEntity.getAction();
        return JsonUtil.getJSONDataByAction(action);
//        switch (action) {
//            case "getAuthData":
//                result = getAuthData(action);
//                break;
//            case "getTaskList":
//                result = getTaskList(action);
//                break;
//            case "getTaskCount ":
//                getTaskCount(action);
//                break;
//            case "getCCList":
//                result = getTaskList(action);
//                break;
//            case "getSponsorList":
//                result = getTaskList(action);
//                break;
//            case "doAction":
//                result = getTaskList(action);
//                break;
//            case "getFilters":
//                result = getTaskList(action);
//                break;
//            default: break;
//        }
    }
}

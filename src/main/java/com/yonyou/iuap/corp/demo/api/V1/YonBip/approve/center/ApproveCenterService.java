package com.yonyou.iuap.corp.demo.api.V1.YonBip.approve.center;


import com.yonyou.iuap.corp.demo.entity.yonbip.approve.center.ApproveCenterEntity;
import com.yonyou.iuap.corp.demo.utils.JsonUtil;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

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
    public JSONObject handleAction(String accessToken, JSONObject requstBody) {
        logger.info("请求参数："+ requstBody);
        ApproveCenterEntity approveCenterEntity = (ApproveCenterEntity)JSONObject.toBean(requstBody,ApproveCenterEntity.class);//strToApproveCenterEntity(requstBody);
        String action = approveCenterEntity.getAction();
        System.out.println(action);
        JSONObject result;
        switch (action) {
//            case "getAuthData":
//                //result = getAuthData(action);
//                break;
            default:
                result = JsonUtil.getJSONDataByAction(action);
                break;
        }
        return result;
    }

    public JSONObject handleAction2(String accessToken, ApproveCenterEntity approveCenterEntity) {
        logger.info("请求参数："+ approveCenterEntity);
        String action = approveCenterEntity.getAction();
        System.out.println(action);
        JSONObject result;
        switch (action) {
//            case "getAuthData":
//                //result = getAuthData(action);
//                break;
            default:
                result = JsonUtil.getJSONDataByAction(action);
                break;
        }
        return result;
    }


}

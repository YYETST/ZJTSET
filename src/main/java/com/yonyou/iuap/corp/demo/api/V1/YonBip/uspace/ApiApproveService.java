package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.ApproveEntity;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @program: corp-demo
 * @description: 审批相关的Service
 * @author: kw
 * @create: 2020/04/10 14:03
 */
@Service
public class ApiApproveService {

    private static final Logger logger = LoggerFactory.getLogger(ApiMessageService.class);

    @Value("${api.uspace.approve.taskCount}")
    private String TASK_COUNT;

    @Value("${api.uspace.approve.approveTypes}")
    private String APPROVE_TYPES;

    @Value("${api.uspace.approve.getApproveTypes}")
    private String GET_APPROVE_TYPES;

    /**
     * @description: 根据应用ID获取待办数量
     * @author: kw
     * @date: 2020/4/10
     * @param: [approveEntity, accessToken]
     * @return: java.lang.String
     */
    public String taskCount(ApproveEntity approveEntity,String accessToken) throws Exception {
        String requestUrl = TASK_COUNT + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl, approveEntity);
        logger.info("taskCount result:{}", result);
        return result;
    }

    /**
     * @description:  根据友互通ID获取租户下审批页签列表
     * @author: kw
     * @date: 2020/4/10
     * @param: [approveEntity, accessToken]
     * @return: java.lang.String
     */
    public String getApproveTypesOldVersion(ApproveEntity approveEntity,String accessToken) throws Exception {
        String requestUrl = APPROVE_TYPES + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl, approveEntity);
        logger.info("getApproveTypesOldVersion result:{}", result);
        return result;
    }
    /**
     * @description: 根据友互通ID获取租户下审批页签列表（新版）
     * @author: kw
     * @date: 2020/4/10
     * @param: [approveEntity, accessToken]
     * @return: java.lang.String
     */
    public String getApproveTypes(ApproveEntity approveEntity,String accessToken) throws Exception {
        String requestUrl = GET_APPROVE_TYPES + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl, approveEntity);
        logger.info("getApproveTypes result:{}", result);
        return result;
    }
}

package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.ApproveEntity;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: corp-demo
 * @description: 应用相关接口的服务层
 * @author: kw
 * @create: 2020/05/12 11:28
 */
@Service
public class ApiAppService {

    private static final Logger logger = LoggerFactory.getLogger(ApiApproveService.class);

    @Value("${api.uspace.app.info_by_app_code}")
    private String INFO_BY_APP_CODE;

    @Value("${app.code}")
    private String APP_CODE;

    /**
     * @description: 根据appcode获取租户的应用信息
     * @author: kw
     * @date: 2020/5/12
     * @param: [appCode, accessToken]
     * @return: java.lang.String
     */
    public String info_by_app_code(String accessToken,String... appCode) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("access_token", accessToken);
        if (appCode.length != 0) {
            params.put("appCode", appCode[0]);
        } else {
            params.put("appCode", APP_CODE);
        }
        String result = HttpClientUtil.get(INFO_BY_APP_CODE, params);
        logger.info("info_by_app_code result:{}", result);
        return result;
    }


}

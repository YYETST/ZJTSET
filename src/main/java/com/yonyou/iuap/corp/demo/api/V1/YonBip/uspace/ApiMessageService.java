package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.MessageEntity;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: corp-demo
 * @description: 服务号相关的业务类
 * @author: kw
 * @create: 2020/04/14 13:55
 */
@Service
public class ApiMessageService {

    private static final Logger logger = LoggerFactory.getLogger(ApiMessageService.class);

    @Value("${api.uspace.message.service_mixed}")
    private String SERVICE_MIXED;

    @Value("${api.uspace.message.service_txt}")
    private String SERVICE_TXT;

    @Value("${api.uspace.message.groups}")
    private String GROUPS;


    /**
     * @description: 服务号发送文本消息
     * @author: kw
     * @date: 2020/4/14
     * @param: [messageEntity, accessToken]
     * @return: java.lang.String
     */
    public String service_mixed(MessageEntity messageEntity, String accessToken) throws Exception {
        String requestUrl = SERVICE_MIXED + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl, messageEntity);
        logger.info("service_mixed result:{}", result);
        return result;
    }

    /**
     * @description: 服务号发送文本消息
     * @author: kw
     * @date: 2020/4/14
     * @param: [messageEntity, accessToken]
     * @return: java.lang.String
     */
    public String service_txt(MessageEntity messageEntity, String accessToken) throws Exception {
        String requestUrl = SERVICE_TXT + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl, messageEntity);
        logger.info("service_txt result:{}", result);
        return result;
    }

    /**
     * @description: 查询某公众号的订阅分组列表
     * @author: kw
     * @date: 2020/4/14
     * @param: [pubaccId, accessToken]
     * @return: java.lang.String
     */
    public String groups(String pubaccId, String accessToken) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("access_token", accessToken);
        params.put("pubaccId", pubaccId);
        String result = HttpClientUtil.get(GROUPS,params);
        logger.info("groups result:{}", result);
        return result;
    }
}

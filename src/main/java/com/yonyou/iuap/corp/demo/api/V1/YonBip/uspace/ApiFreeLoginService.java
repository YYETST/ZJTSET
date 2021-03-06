package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述:免登
 *
 * @author mantan
 * @create 2019-04-09 下午12:53
 */
@Service
public class ApiFreeLoginService {

    private static final Logger logger = LoggerFactory.getLogger(ApiFreeLoginService.class);

    private final static String URL_FREE_LOGIN = "/open/diwork/freelogin/base_info_by_code";

    @Value("${api.host}")
    private String apiHost;
    @Value("${api.freelogin.other}")
    private String other_uri;
    /**
     * 获取免登信息
     * @param code
     * @param userMobileEmailFlag
     * @param accessToken
     * @return
     * @throws Exception
     */
    public String getFreeLoginInfo(String code, String userMobileEmailFlag, String accessToken) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("access_token", accessToken);
        params.put("code", code);
        // userMobileEmailFlag="true",带用户手机号和邮箱返回
        if (!ObjectUtils.isEmpty(userMobileEmailFlag)) {
            params.put("flag", true + "");
        }
        String result = HttpClientUtil.get(apiHost + URL_FREE_LOGIN, params);
        logger.info("getFreeLoginInfo:{}", result);
        return result;
    }
    public String otherLoginTest(String code,String accessToken) throws Exception {
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("code",code);
        params.put("access_token",accessToken);
        //是否用户返回手机号等信息
        params.put("flag",true);
        String result= HttpClientUtil.get(other_uri,params);
        return result;

    }
}

package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiMessageService;
import com.yonyou.iuap.corp.demo.entity.yonbip.UserInfoPEntity;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des 分页获取租户下用户信息, 自建应用需要使用该接口获取租户下所有的用户信息，并存储在自己的应用服务器和自己的用户相关联，
 * 方便后续使用
 */
@Component
public class ApiUserInfoListService extends BaseApi{
    private static final Logger logger = LoggerFactory.getLogger(ApiMessageService.class);
    @Value("${api.user.page_list}")
    private String user_page_list;
    //设置默认的查询页码
    public static final String pageIndex ="1";
    //设置默认的每页显示数量
    public static final String pageSize = "100";

    public String list(String accessToken) throws Exception {
        Map<String,Object> params = new HashMap<>();
        String requestUrl = user_page_list + "?access_token=" + accessToken;
        if(!params.containsKey("index"))params.put("index",pageIndex);
        if(!params.containsKey("size"))params.put("size",pageSize);
        String result = HttpClientUtil.jsonPost(requestUrl,params);
        logger.info("list reslut:{}",result);
        return result;
    }
}

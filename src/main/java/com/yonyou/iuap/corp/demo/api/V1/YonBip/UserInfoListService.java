package com.yonyou.iuap.corp.demo.api.V1.YonBip;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.yonbip.UserInfoPEntity;
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
public class UserInfoListService extends BaseApi{

    @Value("${api.user.page_list}")
    private String user_page_list;

    public UserInfoPEntity list() throws Exception {
        Map<String,Object> params = new HashMap<>();
        UserInfoPEntity userInfo = requestPostPage1(user_page_list,params,UserInfoPEntity.class);
        return userInfo;
    }
}

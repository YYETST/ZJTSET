package com.yonyou.iuap.corp.demo.yonbip;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiUserInfoListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des  获取租户下用户信息列表
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoListTest {

    @Autowired
    ApiUserInfoListService apiUserInfoListService;
    @Autowired
    private ApiAccessTokenService apiAccessTokenService;
    /**
     * 获取用户信息列表
     */
    @Test
    public void getUserInfoList() throws Exception {
        String result = apiUserInfoListService.list(apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }


    /**
     * 根据手机号获取用户信息
     * userid就是yhtuserid
     */
    @Test
    public void getUserInfoByMobile() throws Exception {
        String result = apiUserInfoListService.detailByMobile(apiAccessTokenService.getAccessToken(),"18810487612");
        System.out.println(result);
    }

}

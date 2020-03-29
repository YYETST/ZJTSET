package com.yonyou.iuap.corp.demo.yonbip;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.UserInfoListService;
import com.yonyou.iuap.corp.demo.entity.yonbip.UserInfoPEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

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
    UserInfoListService userInfoListService;

    /**
     * 获取用户信息列表
     */
    @Test
    public void getUserInfoList() throws Exception {
        UserInfoPEntity result = userInfoListService.list();
        System.out.println(result.toString());
    }

}

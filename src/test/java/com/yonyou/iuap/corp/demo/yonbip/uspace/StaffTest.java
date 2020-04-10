package com.yonyou.iuap.corp.demo.yonbip.uspace;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.AccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiStaffService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: corp-demo
 * @description: 员工相关接口测试类
 * @author: kw
 * @create: 2020/04/07 13:40
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StaffTest {


    @Autowired
    private ApiStaffService apiStaffService;
    @Autowired
    private AccessTokenService accessTokenService;

    /**
     * @description:  根据手机号或者邮箱查询员工
     * @author: kw
     * @date: 2020/4/7
     * @param: []
     * @return: void
     */
    @Test
    public void info_by_mobile_email() throws Exception {
        String type = "1";
        String field = "17352777151";// "17352777151";
        String result = apiStaffService.searchStaffByMobileOrEmail(type, field, accessTokenService.getAccessToken());
        System.out.println(result);
    }
}

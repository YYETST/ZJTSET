package com.yonyou.iuap.corp.demo.yonbip;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiFreeLoginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/4/15
 * @des 免登测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FreeloginTest {

    @Autowired
    ApiFreeLoginService ApiFreeLoginService;
    @Autowired
    private ApiAccessTokenService apiAccessTokenService;
    /**
     * 免登接口
     * @throws Exception
     */
    @Test
    public void freeLogin() throws Exception {
       String result = ApiFreeLoginService.otherLoginTest("e508c80eee99b076bf5058f9a6f79ab2728a576e946747784ccb50680393&qzId=152676", apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }
}

package com.yonyou.iuap.corp.demo.yonbip;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiUspaceServie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des  获取应用服务列表
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UspaceListTest {

    @Autowired
    ApiUspaceServie apiUspaceServie;
    @Autowired
    private ApiAccessTokenService apiAccessTokenService;

    /**
     * 根据appcode获取应用服务列表
     */
    @Test
    public void getUspaceListList() throws Exception {
        String result = apiUspaceServie.list(apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }

}

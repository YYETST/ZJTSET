package com.yonyou.iuap.corp.demo.yonbip.uspace;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.AccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAppService;
import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.StaffPageParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: corp-demo
 * @description: 服务的测试类
 * @author: kw
 * @create: 2020/05/12 11:34
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest {

    @Autowired
    private AccessTokenService accessTokenService;

    @Autowired
    private ApiAppService apiAppService;


    /**
     * @description:  根据appcode获取租户的应用信息
     * @author: kw
     * @date: 2020/5/12
     * @param: []
     * @return: void
     */
    @Test
    public void getStaffPageList() throws Exception {
        //默认为获取当前appcode下应用信息
        //String appCode = "f4af1866-72bc-4efd-9aca-9fb2c06d600c";
        //String result = apiAppService.info_by_app_code(accessTokenService.getAccessToken(),appCode);
        String result = apiAppService.info_by_app_code(accessTokenService.getAccessToken());
        System.out.println(result);
    }
}

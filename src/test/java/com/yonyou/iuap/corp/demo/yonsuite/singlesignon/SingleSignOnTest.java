package com.yonyou.iuap.corp.demo.yonsuite.singlesignon;

import com.yonyou.iuap.corp.demo.api.V1.YonSuite.SingleSignOnService;
import com.yonyou.iuap.corp.demo.entity.YonSuite.user.ThirdUserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.io.IOException;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  单点登录测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SingleSignOnTest {
    @Autowired
    private SingleSignOnService singleSignOnService;

    /**
     * 测试单点登录YS
     */
    @Test
    public void login() throws Exception {
        ThirdUserEntity entity = new ThirdUserEntity();
        entity.setThirdUcId("bhw6d87o");   //集成认证中心编码
        entity.setUserId("12345");
        entity.setUserCode("ssss");
        entity.setUserName("****");
        String loginUrl = singleSignOnService.getSingleSignOnUrl(entity);
        System.out.println("这是可以实现单点登录的地址:"+loginUrl);
        //注意这里是方便测试直接通过命令打开
        //TODO：线上项目应该通过点击按钮等其他形式请求后台返回拼接的登录url，然后在前端使用js window.open(loginUrl, "_blank");
        oepnEexplorer(loginUrl);
    }


    private void oepnEexplorer(String url) throws IOException {
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


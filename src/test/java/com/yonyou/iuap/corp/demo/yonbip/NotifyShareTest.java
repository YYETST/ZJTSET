package com.yonyou.iuap.corp.demo.yonbip;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiNotifyShareService;
import com.yonyou.iuap.corp.demo.entity.yonbip.notify.NotifyShareEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/31
 * @des 通知测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class NotifyShareTest {

    @Autowired
    ApiNotifyShareService apiNotifyShareService;
    @Autowired
    private ApiAccessTokenService apiAccessTokenService;
    /**
     * 发送通知
     */
    @Test
    public void share() throws Exception {
        NotifyShareEntity notifyEntity = new NotifyShareEntity();
        notifyEntity.setAppId("209429");
        notifyEntity.setTitle("test");
        notifyEntity.setContent("this is a test notity");
        notifyEntity.setTenantId("zjhrilpq");
        List<String> userlist = new ArrayList<String>();
        userlist.add("0f059088-9c92-4769-a3e7-8f1a341cc3df");
        userlist.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
        notifyEntity.setYhtUserIds(userlist);
        String result = apiNotifyShareService.share(notifyEntity, apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }
}

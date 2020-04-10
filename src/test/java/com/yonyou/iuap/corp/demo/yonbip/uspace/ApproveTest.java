package com.yonyou.iuap.corp.demo.yonbip.uspace;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.AccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiApproveService;
import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.ApproveEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: corp-demo
 * @description: 审批相关的测试类
 * @author: kw
 * @create: 2020/04/10 14:28
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ApproveTest {

    @Autowired
    private ApiApproveService apiApproveService;
    @Autowired
    private AccessTokenService accessTokenService;


    /**
     * @description:   根据应用ID获取待办数量
     * @author: kw
     * @date: 2020/4/10
     * @param: []
     * @return: void
     */
    @Test
    public void taskCount() throws Exception {
        ApproveEntity approveEntity = new ApproveEntity();
        //租户id  查看方式 参考https://open.diwork.com/#/doc-center/docDes/doc?code=open_jrwd&section=46216495b9c54c5690a2df304211e3d2
        approveEntity.setTenantId("zjhrilpq");
        //友互通用户id
        approveEntity.setYhtUserId("40b6b763-31af-46b3-b4b3-c62296914c6d");
        //友空间id
        List appIds = new ArrayList();
        appIds.add("0dd0b8bd-be92-4ec6-b6b4-9e96b5ea20f5");
        appIds.add("209429");
        approveEntity.setAppIds(appIds);
        System.out.println(accessTokenService.getAccessToken());
        String result = apiApproveService.taskCount(approveEntity, accessTokenService.getAccessToken());
        System.out.println(result);
    }

    /**
     * @description:  根据友互通ID获取租户下审批页签列表（新版）
     * @author: kw
     * @date: 2020/4/10
     * @param: []
     * @return: void
     */
    @Test
    public void getApproveTypes() throws Exception {
        ApproveEntity approveEntity = new ApproveEntity();
        //友互通用户id
        approveEntity.setYhtUserId("40b6b763-31af-46b3-b4b3-c62296914c6d");
        approveEntity.setSiteType("m");
        String result = apiApproveService.getApproveTypes(approveEntity, accessTokenService.getAccessToken());
        System.out.println(result);
    }
}

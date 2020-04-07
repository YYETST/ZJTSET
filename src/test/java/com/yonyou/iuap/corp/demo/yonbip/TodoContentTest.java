package com.yonyou.iuap.corp.demo.yonbip;

import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.ToDoContent;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.AccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiToDoCenterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: corp-demo
 * @description: 待办
 * @author: kw
 * @create: 2020/04/02 15:30
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoContentTest {

    @Autowired
    private ApiToDoCenterService apiToDoCenterService;

    @Autowired
    private AccessTokenService accessTokenService;

    /*
     * @description: 待办
     * @author: kw
     * @date: 2020/4/2
     * @param: []
     * @return: void
     */
    @Test
    public void todo() throws Exception {
        ToDoContent toDoContent = new ToDoContent();
        toDoContent.setAppId("153797");
        toDoContent.setTitle("测试");
        toDoContent.setTypeName("测试类型");
        toDoContent.setBusinessKey("1234567890");
        toDoContent.setContent("创建待办事件测试");
        List yyUserIds = new ArrayList();
        yyUserIds.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
        toDoContent.setYyUserIds(yyUserIds);
        toDoContent.setTenantId("gbpwpfil");
        String result = apiToDoCenterService.sendToDo(toDoContent,accessTokenService.getAccessToken());
        System.out.println(result);
    }

    /**
     * @description:  标记待办事件为已处理
     * @author: kw
     * @date: 2020/4/3
     * @param:
     * @return:
     */
    @Test
    public void sendDone() throws Exception {
        ToDoContent toDoContent = new ToDoContent();
        toDoContent.setAppId("153797");
        toDoContent.setBusinessKey("1234567890");
        List yyUserIds = new ArrayList();
        yyUserIds.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
        toDoContent.setYyUserIds(yyUserIds);
        toDoContent.setTenantId("gbpwpfil");
        String result = apiToDoCenterService.sendDone(toDoContent,accessTokenService.getAccessToken());
        System.out.println(result);
    }

    /**
     * @description:  删除待办事件
     * @author: kw
     * @date: 2020/4/3
     * @param: []
     * @return: void
     */
    @Test
    public void revocation() throws Exception {
        ToDoContent toDoContent = new ToDoContent();
        toDoContent.setAppId("153797");
        toDoContent.setBusinessKey("1234567890");
        List yyUserIds = new ArrayList();
        yyUserIds.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
        toDoContent.setYyUserIds(yyUserIds);
        toDoContent.setTenantId("gbpwpfil");
        String result = apiToDoCenterService.revocation(toDoContent,accessTokenService.getAccessToken());
        System.out.println(result);
    }
}
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        //ykjid  可以根据appcode获取服务列表获得
        toDoContent.setAppId("245159");
        //事件标题,不超过300字符
        toDoContent.setTitle("测试待办2");
        //类型名称, 即移动端页签名称,不超过5个字符
        toDoContent.setTypeName("测试类型");
        //待办事件唯一KEY, 用来标记为已处理或者删除使用，需要业务系统保证唯一性,不超过200字符
        toDoContent.setBusinessKey("111111145");
        //事件描述,不超过500字符
        toDoContent.setContent("创建待办事件测试8");
        //友户通人员ID, 待办分配的人员，不能为空
        List yyUserIds = new ArrayList();
        yyUserIds.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
        toDoContent.setYyUserIds(yyUserIds);
        //租户ID, 会根据该参数查询出空间ID
        toDoContent.setTenantId("zjhrilpq");
        toDoContent.setmUrl("https://www.baidu.com/");
        toDoContent.setWebUrl("https://www.json.cn/?code=${esncode}");
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
        toDoContent.setAppId("152676");
        toDoContent.setBusinessKey("12345678901");
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
        toDoContent.setAppId("209429");
        toDoContent.setBusinessKey("1234567890");
        List yyUserIds = new ArrayList();
        yyUserIds.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
        toDoContent.setYyUserIds(yyUserIds);
        toDoContent.setTenantId("gbpwpfil");
        String result = apiToDoCenterService.revocation(toDoContent,accessTokenService.getAccessToken());
        System.out.println(result);
    }



    /**
     * @description:  获取待办条目
     * @author: kw
     * @date: 2020/5/11
     * @param: []
     * @return: void
     */
    @Test
    public void items() throws Exception {
        ToDoContent toDoContent = new ToDoContent();
        //ykjid  可以根据appcode获取服务列表获得
        toDoContent.setAppId("245159");
        // toDoContent.setAppId("153797");
//        List yyUserIds = new ArrayList();
//        yyUserIds.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
//        // toDoContent.setYyUserIds(yyUserIds);
//        toDoContent.setYhtUserId("40b6b763-31af-46b3-b4b3-c62296914c6d");
//        List appIds = new ArrayList();
//        appIds.add("0dd0b8bd-be92-4ec6-b6b4-9e96b5ea20f5");
//        toDoContent.setAppIds(appIds);
        String result = apiToDoCenterService.items(toDoContent,accessTokenService.getAccessToken());
        System.out.println(result);
    }
}

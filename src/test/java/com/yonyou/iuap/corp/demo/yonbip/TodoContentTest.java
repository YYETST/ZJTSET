package com.yonyou.iuap.corp.demo.yonbip;

import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.ToDoContent;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAccessTokenService;
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
    private ApiAccessTokenService apiAccessTokenService;

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
        toDoContent.setAppId("271295");
        //事件标题,不超过300字符
        toDoContent.setTitle("贾婧雯测试待办");
        //类型名称, 即移动端页签名称,不超过5个字符
        toDoContent.setTypeName("测试类型");
        //待办事件唯一KEY, 用来标记为已处理或者删除使用，需要业务系统保证唯一性,不超过200字符
        toDoContent.setBusinessKey("123456789");
        //事件描述,不超过500字符
        toDoContent.setContent("贾婧雯创建待办事件测试");
        //友户通人员ID, 待办分配的人员，不能为空
        List yyUserIds = new ArrayList();
        yyUserIds.add("836efe76-7a08-464d-98c9-f5a5032e5ef0");
        toDoContent.setYyUserIds(yyUserIds);
        //租户ID, 会根据该参数查询出空间ID
        toDoContent.setTenantId("zjhrilpq");
        toDoContent.setmUrl("https://www.baidu.com/");
        toDoContent.setWebUrl("https://www.json.cn/?code=${esncode}");
        String result = apiToDoCenterService.sendToDo(toDoContent, apiAccessTokenService.getAccessToken());
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
        toDoContent.setAppId("271295");
        toDoContent.setBusinessKey("123456789");
        List yyUserIds = new ArrayList();
        yyUserIds.add("836efe76-7a08-464d-98c9-f5a5032e5ef0");
        toDoContent.setYyUserIds(yyUserIds);
        toDoContent.setTenantId("zjhrilpq");
        String result = apiToDoCenterService.sendDone(toDoContent, apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }

    /**
     * 标记待办事件为已读
     * @throws Exception
     */
    @Test
    public void read() throws Exception {
        ToDoContent toDoContent = new ToDoContent();
        toDoContent.setAppId("271295");
        toDoContent.setBusinessKey("123456789");
        List yyUserIds = new ArrayList();
        yyUserIds.add("836efe76-7a08-464d-98c9-f5a5032e5ef0");
        toDoContent.setYyUserIds(yyUserIds);
        toDoContent.setYhtUserId("836efe76-7a08-464d-98c9-f5a5032e5ef0");
        toDoContent.setTenantId("zjhrilpq");
        String result = apiToDoCenterService.read(toDoContent, apiAccessTokenService.getAccessToken());
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
        toDoContent.setAppId("271295");
        toDoContent.setBusinessKey("123456789");
        List yyUserIds = new ArrayList();
        yyUserIds.add("836efe76-7a08-464d-98c9-f5a5032e5ef0");
        toDoContent.setYyUserIds(yyUserIds);

        toDoContent.setTenantId("zjhrilpq");
        String result = apiToDoCenterService.revocation(toDoContent, apiAccessTokenService.getAccessToken());
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
        toDoContent.setAppId("271295");
        // toDoContent.setAppId("153797");
//        List yyUserIds = new ArrayList();
//        yyUserIds.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
//        // toDoContent.setYyUserIds(yyUserIds);
//        toDoContent.setYhtUserId("40b6b763-31af-46b3-b4b3-c62296914c6d");
//        List appIds = new ArrayList();
//        appIds.add("0dd0b8bd-be92-4ec6-b6b4-9e96b5ea20f5");
//        toDoContent.setAppIds(appIds);
        String result = apiToDoCenterService.items(toDoContent, apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }
}

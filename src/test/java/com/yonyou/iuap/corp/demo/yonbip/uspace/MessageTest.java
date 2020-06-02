package com.yonyou.iuap.corp.demo.yonbip.uspace;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiMessageService;
import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.ArticlesEntity;
import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.MessageEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: corp-demo
 * @description: 服务号的测试类
 * @author: kw
 * @create: 2020/04/14 14:51
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageTest {

    @Autowired
    private ApiAccessTokenService apiAccessTokenService;

    @Autowired
    private ApiMessageService apiMessageService;

    /**
     * @description:  查询某公众号的订阅分组列表
     * @author: kw
     * @date: 2020/4/14
     * @param: []
     * @return: void
     */
    @Test
    public void groups() throws Exception {
        String pubaccId = "msgaccount_152676_kw001";
        String result = apiMessageService.groups(pubaccId, apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }

    /**
     * @description:  服务号发送文本消息
     * @author: kw
     * @date: 2020/4/14
     * @param: []
     * @return: void
     */
    @Test
    public void service_txt() throws Exception {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setTenantId("zjhrilpq");
        messageEntity.setPubAccId("kw001");
        //list
//        messageEntity.setSendScope("list");
//        List to = new ArrayList();
//        to.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
        //to.add("0f059088-9c92-4769-a3e7-8f1a341cc3df");

        //group
        List to1 = new ArrayList();
        to1.add("GRP_152676_1585732568476");
        messageEntity.setSendScope("group");
        messageEntity.setTo(to1);
        messageEntity.setContent("服务号发送文本消息测试-群组");
        String result = apiMessageService.service_txt(messageEntity, apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }

    /**
     * @description: 服务号发送图文消息
     * @author: kw
     * @date: 2020/4/14
     * @param: []
     * @return: void
     */
    @Test
    public void service_mixed() throws Exception {
        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setTenantId("zjhrilpq");
        messageEntity.setPubAccId("kw001");
        //list
        messageEntity.setSendScope("group");
        List to = new ArrayList();
        to.add("40b6b763-31af-46b3-b4b3-c62296914c6d");
        //to.add("0f059088-9c92-4769-a3e7-8f1a341cc3df");

        //group
        List to1 = new ArrayList();
        to1.add("GRP_152676_1585732568476");
        to1.add("GRP_152676_1585732837804");
        messageEntity.setSendScope("group");
        messageEntity.setTo(to1);

        ArticlesEntity articlesEntity = new ArticlesEntity();
        articlesEntity.setAuthor("作者姓名");
        articlesEntity.setCommentable(true);
        articlesEntity.setShareAble(true);
        articlesEntity.setTitle("标题");
        articlesEntity.setDigest("摘要");
        //articlesEntity.setThumbId("https://dss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3413585386,56252193&fm=26&gp=0.jpg");
        articlesEntity.setThumbId("https://dss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1473924478,735350394&fm=26&gp=0.jpg");
        articlesEntity.setContentSourceUrl("http://www.baidu.com");
        articlesEntity.setViceTitle("副标题");
        articlesEntity.setContentSource("<p>无</p>");

        List<ArticlesEntity> articles = new ArrayList<>();
        articles.add(articlesEntity);
        messageEntity.setArticles(articles);
        String result = apiMessageService.service_mixed(messageEntity, apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }
}

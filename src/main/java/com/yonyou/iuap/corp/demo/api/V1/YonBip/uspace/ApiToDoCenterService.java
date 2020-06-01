package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.ToDoContent;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 待办
 * @author wangyu
 */
@Service
public class ApiToDoCenterService {
    private static final Logger logger = LoggerFactory.getLogger(ApiToDoCenterService.class);

    private final static String URL_DONE = "/open/diwork/todocenter/done";

    private final static String URL_REVOCATION = "/open/diwork/todocenter/revocation";

    @Value("${api.todocenter.todo}")
    private String TODO;
    @Value("${api.todocenter.revocation}")
    private String REVOCATION;
    @Value("${api.uspace.approve.items}")
    private String ITEMS;

    @Value("${api.host}")
    private String apiHost;

    /**
     * 发送待办事件
     * @param toDoContent
     * @param accessToken
     * @return
     * @throws Exception
     */
    public String sendToDo(ToDoContent toDoContent,String accessToken) throws Exception{
        String requestUrl = TODO + "?access_token=" + accessToken;
        //String requestUrl = apiHost + URL_TO_DO + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl,toDoContent);
        logger.info("sendToDo result:{}", result);
        return result;
    }

    /**
     * 标记待办事件为已处理
     * @param toDoContent
     * @param accessToken
     * @return
     * @throws Exception
     */
    public String sendDone(ToDoContent toDoContent,String accessToken) throws Exception{
        String requestUrl = apiHost + URL_DONE + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl,toDoContent);
        logger.info("sendToDo result:{}", result);
        return result;
    }

    /**
     * 删除待办事件
     * @param toDoContent
     * @param accessToken
     * @return
     * @throws Exception
     */
    public String revocation(ToDoContent toDoContent,String accessToken) throws Exception{
        String requestUrl = REVOCATION + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl,toDoContent);
        logger.info("sendToDo result:{}", result);
        return result;
    }

    /**
     * @description: 获取待办条目
     * @author: kw
     * @date: 2020/5/11
     * @param: [toDoContent, accessToken]
     * @return: java.lang.String
     */
    public String items(ToDoContent toDoContent,String accessToken) throws Exception {
        String requestUrl = ITEMS + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl,toDoContent);
        logger.info("items result:{}", result);
        return result;
    }
}

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

    private final static String URL_TO_DO = "/open/diwork/todocenter/todo";

    private final static String URL_DONE = "/open/diwork/todocenter/done";

    private final static String URL_REVOCATION = "/open/diwork/todocenter/revocation";

    @Value("${api.uspace.approve.getTaskCount}")
    private String GET_TAST_COUNT;

    @Value("${api.todocenter.todo}")
    private String TODO;

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
        String requestUrl = apiHost + URL_REVOCATION + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl,toDoContent);
        logger.info("sendToDo result:{}", result);
        return result;
    }

    /**
     * @description:  根据应用ID获取待办数量（新版）
     * @author: kw
     * @date: 2020/4/13
     * @param: [toDoContent, accessToken]
     * @return: java.lang.String
     */
    public String getTaskCount(ToDoContent toDoContent,String accessToken) throws Exception {
        String requestUrl = GET_TAST_COUNT + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl,toDoContent);
        logger.info("getTaskCount result:{}", result);
        return result;
    }

}

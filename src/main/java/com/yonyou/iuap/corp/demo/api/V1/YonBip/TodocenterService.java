package com.yonyou.iuap.corp.demo.api.V1.YonBip;

import com.yonyou.iuap.corp.demo.model.ToDoContent;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: corp-demo
 * @description: 待办
 * @author: kw
 * @create: 2020/04/02 14:21
 */
@Component
public class TodocenterService {

    @Value("${api.todocenter.todo}")
    private String todocenterTodo;

//    public String sendToDo(ToDoContent toDoContent, String accessToken) throws Exception{
//        String requestUrl = apiHost + URL_TO_DO + "?access_token=" + accessToken;
//        String result = HttpClientUtil.jsonPost(requestUrl,toDoContent);
//        logger.info("sendToDo result:{}", result);
//        return result;
//    }

}

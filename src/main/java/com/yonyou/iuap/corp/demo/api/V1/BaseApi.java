package com.yonyou.iuap.corp.demo.api.V1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.yonyou.iuap.corp.demo.constraint.ResultCode;
import com.yonyou.iuap.corp.demo.utils.RequestTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
 * @author nishch
 * @version 3.0
 * @date 2020/3/11
 * @des  自建应用token替换为ISV生态应用token
 */
public abstract class BaseApi {

    private static final Logger logger = LoggerFactory.getLogger(BaseApi.class);
    //设置默认的查询页码
    public static final String pageIndex ="1";
    //设置默认的每页显示数量
    public static final String pageSize = "100";

    private static ObjectMapper mapper = new ObjectMapper();

    private static Gson gson = new Gson();

    //自建应用token
    @Autowired
    private SelfBuildToken token;


    public  <T> T doGet(String requestUrl, Map<String, Object> paramMap, Class<T> type) throws Exception {
        requestUrl = getUrl(requestUrl);
        return mapper.readValue(getRequestData(RequestTool.doGet(requestUrl, paramMap,false)), type);
    }

    public  <T> T doGet(String requestUrl, Map<String, Object> paramMap, TypeReference<T> typeReference) throws Exception {
        requestUrl = getUrl(requestUrl);
        return mapper.readValue(getRequestData(RequestTool.doGet(requestUrl, paramMap,false)), typeReference);
    }

    public  <T> T doGetMark(String requestUrl, Map<String, Object> paramMap, Class<T> type) throws Exception {
        return mapper.readValue(getRequestData(RequestTool.doGet(requestUrl, paramMap,true)), type);
    }

    public  <T> T doGetMark(String requestUrl, Map<String, Object> paramMap, TypeReference<T> typeReference) throws Exception {
        return mapper.readValue(getRequestData(RequestTool.doGet(requestUrl, paramMap,true)), typeReference);
    }

    public  <T> T doPost(String requestUrl, Object param, Class<T> type) throws Exception {
        requestUrl = getUrl(requestUrl);
        return mapper.readValue(getRequestData(RequestTool.doPost(requestUrl, param)), type);
    }

    public  <T> T doPost(String requestUrl, Object param, TypeReference<T> typeReference) throws Exception {
        requestUrl = getUrl(requestUrl);
        return mapper.readValue(getRequestData(RequestTool.doPost(requestUrl, param)), typeReference);
    }
    /**
     * post分页获取数据信息index,size
     * @return
     */
    public <T> T requestPostPage1(String requestUri,Map<String,Object> params,Class<T> type) throws Exception {
        if(!params.containsKey("index"))params.put("index",pageIndex);
        if(!params.containsKey("size"))params.put("size",pageSize);
        return doPost(requestUri,params,type);
    }

    /**
     * post分页获取数据信息pageIndex,pageSize
     * @return
     */
    public <T> T requestPostPage2(String requestUri,Map<String,Object> params,Class<T> type) throws Exception {
        if(!params.containsKey("pageIndex"))params.put("pageIndex",pageIndex);
        if(!params.containsKey("pageSize"))params.put("pageSize",pageSize);
        return doPost(requestUri,params,type);
    }


    protected  String getRequestData(String json) throws Exception {
        String data = null;
        Map result = gson.fromJson(json,Map.class);
        if(ResultCode.SUCCESS.getIndex().equals(result.get(ResultCode.SUCCESS.getName()))
                ||ResultCode.SUCCESS2.getIndex().equals(result.get(ResultCode.SUCCESS2.getName()))){
            data = gson.toJson(result.get("data"));
        }else{
            logger.error(result.get("message").toString());
            throw  new Exception(result.get("message").toString());
        }
        return data;
    }

    /**
     * 自建应用拼装token
     * @param requestUri
     * @return
     * @throws Exception
     */
    protected  String getUrl(String requestUri) throws Exception {
        String access_token = token.createToken();
        return requestUri+"?access_token="+access_token;
    }
}

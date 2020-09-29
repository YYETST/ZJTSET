package com.yonyou.iuap.corp.demo.api.V1.YonSuite;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.YonSuite.transtype.TranstypeBodyEntity;
import com.yonyou.iuap.corp.demo.entity.YonSuite.transtype.TranstypeHeadEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  交易类型
 */
@Component
public class TranstypeService extends BaseApi {

    @Value("${api.transtype.list}")
    private String list_uri;
    @Value("${api.transtype.detail}")
    private String detail_uri;
    @Value("${api.transtype.save}")
    private String save_uri;
    @Value("${api.transtype.tree}")
    private String tree_uri;


    /**
     * 获取交易类型树
     * @param params
     * @return
     * @throws Exception
     */
    public Object tree(Map<String, Object> params) throws Exception {
        return doPost(tree_uri,params,Object.class);
    }
    /**
     * 获取交易类型列表
     * @param params
     * @return
     */
    public Object list(Map<String, Object> params) throws Exception {
        if(null==params){
            params = new HashMap<>();
        }
        if(!params.containsKey("page")){
            Map<String, Object> page = new HashMap<>();
            if(!page.containsKey("pageIndex"))page.put("pageIndex",pageIndex);
            if(!page.containsKey("pageSize"))page.put("pageSize",pageSize);
            params.put("page",page);
        }
        Object result = doPost(list_uri,params,Object.class);
        return result;
    }

    /**
     * 获取交易类型详情
     * @param params
     * @return
     */
    public TranstypeBodyEntity detail(Map<String, Object> params) throws Exception {
        TranstypeBodyEntity result = doGet(detail_uri,params,TranstypeBodyEntity.class);
        return result;
    }
}

package com.yonyou.iuap.corp.demo.api.V1.YonSuite.purinrecord;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.YonSuite.otherecord.OtherrecordSaveEntity;
import com.yonyou.iuap.corp.demo.utils.RequestTool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/9/28
 * @des  其他出库
 */
@Component
public class OthoutrecordService extends BaseApi {

    private static final Logger logger = LoggerFactory.getLogger(OthoutrecordService.class);

    @Value("${api.othoutrecord.list}")
    private String list_uri;
    @Value("${api.othoutrecord.detail}")
    private String detail_uri;
    @Value("${api.othoutrecord.save}")
    private String save_uri;

    public Object list(Map<String,Object> params) throws Exception {
        Object data = requestPostPage2(list_uri,params,Object.class);
        return data;
    }


    public Object detail(Map<String,Object> params) throws Exception {
        Object result  =  doGet(detail_uri,params,Object.class);
        return result;
    }

    public Object save(OtherrecordSaveEntity purchaseOr) throws Exception {
        Map<String,Object> params = new HashMap<String,Object>();
        purchaseOr.set_status("Insert");
        params.put("data",purchaseOr);
        return getRequestData(RequestTool.doPost(getUrl(save_uri), params));
    }
}

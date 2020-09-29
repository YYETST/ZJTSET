package com.yonyou.iuap.corp.demo.api.V1.YonSuite.purinrecord;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.YonSuite.purchaseOrder.PurchaseOrderHeadEntity;
import com.yonyou.iuap.corp.demo.entity.YonSuite.purinrecord.PurinrecordListEntity;
import com.yonyou.iuap.corp.demo.entity.YonSuite.purinrecord.PurinrecordSaveEntity;
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
 * @des  采购入库
 */
@Component
public class PurinrecordService extends BaseApi {

    private static final Logger logger = LoggerFactory.getLogger(PurinrecordService.class);

    @Value("${api.purinrecord.list}")
    private String list_uri;
    @Value("${api.purinrecord.detail}")
    private String detail_uri;
    @Value("${api.purinrecord.save}")
    private String save_uri;

    public PurinrecordListEntity list(Map<String,Object> params) throws Exception {
        PurinrecordListEntity data = requestPostPage2(list_uri,params,PurinrecordListEntity.class);
        return data;
    }


    public PurchaseOrderHeadEntity detail(Map<String,Object> params) throws Exception {
        PurchaseOrderHeadEntity result  =  doGet(detail_uri,params,PurchaseOrderHeadEntity.class);
        return result;
    }

    public Object save(PurinrecordSaveEntity purchaseOr) throws Exception {
        Map<String,Object> params = new HashMap<String,Object>();
        purchaseOr.set_status("Insert");
        params.put("data",purchaseOr);
        return getRequestData(RequestTool.doPost(getUrl(save_uri), params));
    }
}

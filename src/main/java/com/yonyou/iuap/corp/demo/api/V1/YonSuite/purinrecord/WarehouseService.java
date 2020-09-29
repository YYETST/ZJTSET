package com.yonyou.iuap.corp.demo.api.V1.YonSuite.purinrecord;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.YonSuite.purchaseOrder.PurchaseOrderHeadEntity;
import com.yonyou.iuap.corp.demo.entity.YonSuite.purinrecord.PurinrecordListEntity;
import com.yonyou.iuap.corp.demo.entity.YonSuite.purinrecord.PurinrecordSaveEntity;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/9/29
 * @des 仓库
 */
@Component
@Slf4j
public class WarehouseService extends BaseApi {

    @Value("${api.warehouse.list}")
    private String list_uri;
    @Value("${api.warehouse.detail}")
    private String detail_uri;
    @Value("${api.warehouse.save}")
    private String save_uri;

    public Object list(Map<String,Object> params) throws Exception {
        Object data = requestPostPage2(list_uri,params,Object.class);
        return data;
    }


    public Object detail(Map<String,Object> params) throws Exception {
        Object result  =  doGet(detail_uri,params,Object.class);
        return result;
    }
}

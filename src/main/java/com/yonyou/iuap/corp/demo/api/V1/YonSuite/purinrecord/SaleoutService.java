package com.yonyou.iuap.corp.demo.api.V1.YonSuite.purinrecord;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.YonSuite.saleout.SaleOutEntity;
import com.yonyou.iuap.corp.demo.utils.RequestTool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/10/10
 * @des  销售出库
 */
@Component
@Slf4j
public class SaleoutService extends BaseApi {

    @Value("${api.salesout.list}")
    private String list_uri;
    @Value("${api.salesout.detail}")
    private String detail_uri;
    @Value("${api.salesout.save}")
    private String save_uri;

    public Object list(Map<String,Object> params) throws Exception {
        Object data = requestPostPage2(list_uri,params,Object.class);
        return data;
    }


    public Object detail(Map<String,Object> params) throws Exception {
        Object result  =  doGet(detail_uri,params,Object.class);
        return result;
    }

    public Object save(SaleOutEntity saleout) throws Exception {
        Map<String,Object> params = new HashMap<String,Object>();
        saleout.set_status("Insert");
        params.put("data",saleout);
        return getRequestData(RequestTool.doPost(getUrl(save_uri), params));
    }
}

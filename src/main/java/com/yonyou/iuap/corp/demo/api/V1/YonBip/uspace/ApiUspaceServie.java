package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.YonSuite.product.ProClassListEntity;
import com.yonyou.iuap.corp.demo.entity.yonbip.UspaceListEntity;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des   根据appcode获取服务列表
 *  该接口返回的ykjId 后续在通知、代办等接口传参的时候会用到   ---就是appId
 */
@Component
public class ApiUspaceServie extends BaseApi {

    //根据appcode获取服务列表
    @Value("${api.uspace.servicelist}")
    private String servicelist;

    //应用的appcode
    @Value("${app.code}")
    private String appcode;

    /**
     * 根据appcode获取服务列表 目的是获取结果集中的ykjId
     * @return
     * @throws Exception
     */
    public String list(String accessToken) throws Exception {
        Map<String,Object> params = new HashMap<String,Object>();
        String requestUrl = servicelist + "?access_token=" + accessToken;
        params.put("appCode",appcode);
        params.put("accessToken",accessToken);
        params.put("UspaceListEntity",new TypeReference<List<UspaceListEntity>>(){});
        String result = HttpClientUtil.get(requestUrl,params);
        return result;
    }
}

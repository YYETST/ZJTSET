package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.yonbip.notify.NotifyShareEntity;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/31
 * @des 通知
 */
@Component
public class ApiNotifyShareService extends BaseApi {

    @Value("${api.notify.share}")
    private String notify_share;

    public String share(NotifyShareEntity share,String accessToken) throws Exception {
        share.setSendScope("list");
        Map<String,Object> params = new HashMap<String,Object>();
        String requestUrl = notify_share + "?access_token=" + accessToken;
        String result= HttpClientUtil.jsonPost(requestUrl,share);
      //  String userInfo = doPost(notify_share,share,String.class);

        return result;
    }
}

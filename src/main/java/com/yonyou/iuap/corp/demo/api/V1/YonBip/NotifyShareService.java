package com.yonyou.iuap.corp.demo.api.V1.YonBip;

import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.yonbip.notify.NotifyShareEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/31
 * @des 通知
 */
@Component
public class NotifyShareService extends BaseApi {

    @Value("${api.notify.share}")
    private String notify_share;

    public String share(NotifyShareEntity share) throws Exception {
        share.setSendScope("list");
        String userInfo = doPost(notify_share,share,String.class);
        return userInfo;
    }
}

package com.yonyou.iuap.corp.demo.entity.yonbip.notify;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/31
 * @des
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotifyShareCEntity extends BaseApi {
    private String fromId;

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }
}

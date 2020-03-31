package com.yonyou.iuap.corp.demo.entity.yonbip.notify;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;

import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/31
 * @des
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotifyShareEntity extends BaseApi {
    private String appId;
    private String content;
    private String highlight;
    private List<String> yhtUserIds;
    private String tenantId;
    private String sendScope;
    private String title;
    private NotifyShareCEntity esnData;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public List<String> getYhtUserIds() {
        return yhtUserIds;
    }

    public void setYhtUserIds(List<String> yhtUserIds) {
        this.yhtUserIds = yhtUserIds;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getSendScope() {
        return sendScope;
    }

    public void setSendScope(String sendScope) {
        this.sendScope = sendScope;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public NotifyShareCEntity getEsnData() {
        return esnData;
    }

    public void setEsnData(NotifyShareCEntity esnData) {
        this.esnData = esnData;
    }
}

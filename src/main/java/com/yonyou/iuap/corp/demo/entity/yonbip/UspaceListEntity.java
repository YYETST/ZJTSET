package com.yonyou.iuap.corp.demo.entity.yonbip;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des 应用服务列表实体
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UspaceListEntity extends BaseApi {

    //注意：ykjId很多接口后面会用到
    private String ykjId; //服务对应的空间应用Id
    private String tenantId ; //租户Id
    private String applicationId; //应用Id
    private String serviceId; //服务Id
    private String serviceName; //服务名称
    private String serviceCode; //服务code
    private String enable; //停启用状态
    private String url; //服务地址
    private String serviceIcon; //服务图标
    private String capable; //是否关键性服务
    private String clientStatus; //是否可在pc端显示
    private String webStatus; //是否可在web端显示
    private String phoneStatus; //是否可在移动端显示
    private String strategy; //免登策略
    private String hasWidget; //是否支持桌面磁贴

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getServiceIcon() {
        return serviceIcon;
    }

    public void setServiceIcon(String serviceIcon) {
        this.serviceIcon = serviceIcon;
    }

    public String getCapable() {
        return capable;
    }

    public void setCapable(String capable) {
        this.capable = capable;
    }

    public String getYkjId() {
        return ykjId;
    }

    public void setYkjId(String ykjId) {
        this.ykjId = ykjId;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public String getWebStatus() {
        return webStatus;
    }

    public void setWebStatus(String webStatus) {
        this.webStatus = webStatus;
    }

    public String getPhoneStatus() {
        return phoneStatus;
    }

    public void setPhoneStatus(String phoneStatus) {
        this.phoneStatus = phoneStatus;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getHasWidget() {
        return hasWidget;
    }

    public void setHasWidget(String hasWidget) {
        this.hasWidget = hasWidget;
    }
}

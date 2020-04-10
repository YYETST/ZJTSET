package com.yonyou.iuap.corp.demo.entity.yonbip.uspace;

import java.util.List;

/**
 * @program: corp-demo
 * @description: 审批实体类
 * @author: kw
 * @create: 2020/04/10 14:18
 */
public class ApproveEntity {

    private	String	tenantId	;
    private	String	yhtUserId	;
    private	String	siteType	;
    private List appIds ;

    public List getAppIds() {
        return appIds;
    }

    public void setAppIds(List appIds) {
        this.appIds = appIds;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getYhtUserId() {
        return yhtUserId;
    }

    public void setYhtUserId(String yhtUserId) {
        this.yhtUserId = yhtUserId;
    }

    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }



}

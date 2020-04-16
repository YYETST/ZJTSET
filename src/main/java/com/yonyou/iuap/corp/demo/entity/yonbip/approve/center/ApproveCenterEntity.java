package com.yonyou.iuap.corp.demo.entity.yonbip.approve.center;

/**
 * @program: corp-demo
 * @description: 审批中心请求参数
 * @author: kw
 * @create: 2020/04/16 14:41
 */
public class ApproveCenterEntity {

    private String action;
    private BusinessDataEntity businessData;
    private Object authData;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BusinessDataEntity getBusinessData() {
        return businessData;
    }

    public void setBusinessData(BusinessDataEntity businessData) {
        this.businessData = businessData;
    }

    public Object getAuthData() {
        return authData;
    }

    public void setAuthData(Object authData) {
        this.authData = authData;
    }


}

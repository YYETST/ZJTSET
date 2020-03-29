package com.yonyou.iuap.corp.demo.entity.yonbip;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des  分页获取租户下用户信息 返回的子表数据
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoChEntity extends BaseApi {

    private String userId; //用户id
    private String number; //当前页
    private String userCode; //用户编码
    private String size; //一页大小
    private String userName; //	用户名
    private String totalPages; //总页数
    private String userMobile; //手机号
    private String userMobileCountrycode;//手机号所属国家编码
    private String userEmail; //邮箱
    private String userActivate; //用户是否激活
    private String registerDate; //注册日期
    private String loginTs; //登录时间
    private String userAvatorNew; //头像
    private String userBigAvatorNew;//大头像
    private String userSmallAvatorNew; //小头像
    private String sysId; //系统编码

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserMobileCountrycode() {
        return userMobileCountrycode;
    }

    public void setUserMobileCountrycode(String userMobileCountrycode) {
        this.userMobileCountrycode = userMobileCountrycode;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserActivate() {
        return userActivate;
    }

    public void setUserActivate(String userActivate) {
        this.userActivate = userActivate;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getLoginTs() {
        return loginTs;
    }

    public void setLoginTs(String loginTs) {
        this.loginTs = loginTs;
    }

    public String getUserAvatorNew() {
        return userAvatorNew;
    }

    public void setUserAvatorNew(String userAvatorNew) {
        this.userAvatorNew = userAvatorNew;
    }

    public String getUserBigAvatorNew() {
        return userBigAvatorNew;
    }

    public void setUserBigAvatorNew(String userBigAvatorNew) {
        this.userBigAvatorNew = userBigAvatorNew;
    }

    public String getUserSmallAvatorNew() {
        return userSmallAvatorNew;
    }

    public void setUserSmallAvatorNew(String userSmallAvatorNew) {
        this.userSmallAvatorNew = userSmallAvatorNew;
    }

    public String getSysId() {
        return sysId;
    }

    public void setSysId(String sysId) {
        this.sysId = sysId;
    }
}

package com.yonyou.iuap.corp.demo.entity.yonbip.uspace;

import java.util.List;

/**
 * @program: corp-demo
 * @description: 服务号实体类
 * @author: kw
 * @create: 2020/04/14 14:08
 */
public class MessageEntity {

    private String tenantId;    //	租户ID    Y
    private String pubAccId;    //	创建服务号时填写的账号    Y
    private String sendScope;    //	发送范围，全部人员：all，列表范围: list，指定分组：group    Y
    private Object to;      //发送范围是list时，使用友户通userId；发送范围是group时，使用添加的分组ID【分组ID获取】    Y
    private List<ArticlesEntity> articles; //    Y
    private String content;     //发送的内容      Y

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getPubAccId() {
        return pubAccId;
    }

    public void setPubAccId(String pubAccId) {
        this.pubAccId = pubAccId;
    }

    public String getSendScope() {
        return sendScope;
    }

    public void setSendScope(String sendScope) {
        this.sendScope = sendScope;
    }

    public Object getTo() {
        return to;
    }

    public void setTo(Object to) {
        this.to = to;
    }

    public List<ArticlesEntity> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesEntity> articles) {
        this.articles = articles;
    }

}

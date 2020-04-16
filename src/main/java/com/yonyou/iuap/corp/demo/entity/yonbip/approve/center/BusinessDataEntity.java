package com.yonyou.iuap.corp.demo.entity.yonbip.approve.center;

/**
 * @program: corp-demo
 * @description: businessData相关的参数
 * @author: kw
 * @create: 2020/04/16 14:47
 */
public class BusinessDataEntity {

    private String keywords;    //搜索关键词
    private Integer pageSize;   //分页大小
    private Integer page;   //分页页号
    private String siteType; //请求来源  m-移动端，pc-PC端
    private String status;   //请求状态，1-待办，2-已办
    private Object filters; //用户选择的过滤器,如果用户没有选择，则没有此字段


    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getSiteType() {
        return siteType;
    }

    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getFilters() {
        return filters;
    }

    public void setFilters(Object filters) {
        this.filters = filters;
    }


}

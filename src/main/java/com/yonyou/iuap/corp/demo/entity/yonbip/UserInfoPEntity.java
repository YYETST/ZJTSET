package com.yonyou.iuap.corp.demo.entity.yonbip;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.YonSuite.product.ProductBodyEntity;

import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des 分页获取租户下用户信息 返回的主表数据
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoPEntity  extends BaseApi {

    private int number;
    private int size;
    private int totalPages;
    private List<UserInfoChEntity> content;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<UserInfoChEntity> getContent() {
        return content;
    }

    public void setContent(List<UserInfoChEntity> content) {
        this.content = content;
    }
}

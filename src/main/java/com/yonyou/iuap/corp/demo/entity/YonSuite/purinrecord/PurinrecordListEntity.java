package com.yonyou.iuap.corp.demo.entity.YonSuite.purinrecord;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/9/28
 * @des 采购入库单列表
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class PurinrecordListEntity {

    private String code ;//返回码，调用成功时返回200
    private String message; //调用失败时的错误信息
    private Object data;
    private Object sumRecordList;


}

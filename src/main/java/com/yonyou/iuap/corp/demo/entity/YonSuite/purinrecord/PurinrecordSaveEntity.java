package com.yonyou.iuap.corp.demo.entity.YonSuite.purinrecord;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/9/28
 * @des 采购入库单保存
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class PurinrecordSaveEntity {

    private	String	taxRate	;//	税率
    private	float	exchRate	;//	汇率
    private	String	vouchdate	;//	单据日期
    private	String	accountOrg	;//	会计主体id
    private	String	code	;//	单据编号
    private	String	org	;//	收货组织id
    private String exchRateType; //汇率类型IDid
    private String natCurrency_code; //本币编码
    private String currency_code; //币种编码
    private String vendor; //供应商id
    private String warehouse; //仓库id
    private String bustype; //交易类型id
    private String inInvoiceOrg; //收票组织id
    private String purchaseOrg;//采购组织id
    private String _status;
    private List<PurInRecords> purInRecords; //采购入库单子表

    @Setter
    @Getter
    public static class PurInRecords{
        private String _status ;//	操作标识, Unchanged:数据未改变、 Insert:新增、 Update:更新、Delete:删除
        private String taxRate ; //税率
        private String product ; //物料id
        private int contactsQuantity; //	应收数量
    }


}

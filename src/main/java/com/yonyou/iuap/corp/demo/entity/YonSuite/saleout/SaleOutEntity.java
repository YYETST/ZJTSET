package com.yonyou.iuap.corp.demo.entity.YonSuite.saleout;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/10/10
 * @des 销售出库保存
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class SaleOutEntity {

    private	String	vouchdate	;//	单据日期
    private	String	code	;//	单据编号
    private	String	org	;//	库存组织id，或库存组织code
    private String warehouse; //仓库id，或仓库code
    private String bustype; //交易类型id，或交易类型code
    private String _status;
    private List<SaleOutCh> st_salesouts; //采购入库单子表

    @Setter
    @Getter
    public static class SaleOutCh{
        private String _status ;//	操作标识, Unchanged:数据未改变、 Insert:新增、 Update:更新、Delete:删除
        private String product ; //物料id
        private String invExchRate; //换算率
        private float qty; //数量
    }


}

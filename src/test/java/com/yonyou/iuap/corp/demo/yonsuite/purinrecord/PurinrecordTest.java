package com.yonyou.iuap.corp.demo.yonsuite.purinrecord;

import com.yonyou.iuap.corp.demo.api.V1.YonSuite.purinrecord.PurinrecordService;
import com.yonyou.iuap.corp.demo.entity.YonSuite.purinrecord.PurinrecordSaveEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/9/28
 * @des  采购入库单测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PurinrecordTest {

    @Autowired
    PurinrecordService purinrecordService;

    @Test
    public  void list() throws Exception {
        purinrecordService.list(null);
    }


    @Test
    public  void save() throws Exception {
        PurinrecordSaveEntity saveEntity = new PurinrecordSaveEntity();
        saveEntity.setCode("0000003");
        saveEntity.setCurrency_code("CNY");
        saveEntity.setNatCurrency_code("CNY");
        //先获取树，然后根据path获取列表，进而能够获取到交易类型id ,测试类--TranstypeTest
        saveEntity.setBustype("110000000000024");
        //获取组织列表  测试类---OrgInfoTest
        saveEntity.setAccountOrg("1640201695432960");
        saveEntity.setOrg("1640201695432960");
        saveEntity.setInInvoiceOrg("1640201695432960");
        saveEntity.setPurchaseOrg("1640201695432960");
        saveEntity.setExchRate(1.000f);
        saveEntity.setVouchdate("2020-09-29");
        //获取仓库id   , 测试类  ---WarehouseTest
        saveEntity.setWarehouse("1652902268227840");
        //----------------------------------------------------------子表数据
        List<PurinrecordSaveEntity.PurInRecords> listCh = new ArrayList<>();
        PurinrecordSaveEntity.PurInRecords children = new PurinrecordSaveEntity.PurInRecords();
        //物料id   ----------测试类 ProductTest
        children.setProduct("1641556234555648");
        //库存业务不允许数量、应收/发数量同时为空
        children.setContactsQuantity(100);
        children.setQty(11.11f);
        children.set_status("Insert");
        listCh.add(children);
        saveEntity.setPurInRecords(listCh);
        Object save = purinrecordService.save(saveEntity);
        System.out.println(save);
    }
}

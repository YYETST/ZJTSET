package com.yonyou.iuap.corp.demo.yonsuite.purinrecord;

import com.yonyou.iuap.corp.demo.api.V1.YonSuite.purinrecord.OthercordService;
import com.yonyou.iuap.corp.demo.api.V1.YonSuite.purinrecord.SaleoutService;
import com.yonyou.iuap.corp.demo.entity.YonSuite.otherecord.OtherrecordSaveEntity;
import com.yonyou.iuap.corp.demo.entity.YonSuite.saleout.SaleOutEntity;
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
 * @des  销售出库测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SaleOutTest {

    @Autowired
    SaleoutService saleoutService;

    @Test
    public  void list() throws Exception {
        saleoutService.list(null);
    }


    @Test
    public  void save() throws Exception {
        SaleOutEntity saveEntity = new SaleOutEntity();
        saveEntity.setCode("0000003");
        //先获取树，然后根据path获取列表，进而能够获取到交易类型id/code ,测试类--TranstypeTest
        saveEntity.setBustype("A08001");
        //获取组织列表  测试类---OrgInfoTest
        saveEntity.setOrg("1002");
        saveEntity.setVouchdate("2020-09-29");
        //获取仓库id   , 测试类  ---WarehouseTest
        saveEntity.setWarehouse("001");
        //----------------------------------------------------------子表数据
        List<SaleOutEntity.SaleOutCh> listCh = new ArrayList<>();
        SaleOutEntity.SaleOutCh children = new SaleOutEntity.SaleOutCh();
        //物料id   ----------测试类 ProductTest
        children.setProduct("010001");
        //库存业务不允许数量、应收/发数量同时为空
        children.setQty(11.11f);
        children.set_status("Insert");
        listCh.add(children);
        saveEntity.setSt_salesouts(listCh);
        Object save = saleoutService.save(saveEntity);
        System.out.println(save);
    }
}

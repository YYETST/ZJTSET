package com.yonyou.iuap.corp.demo.yonsuite.purinrecord;

import com.yonyou.iuap.corp.demo.api.V1.YonSuite.purinrecord.PurinrecordService;
import com.yonyou.iuap.corp.demo.api.V1.YonSuite.purinrecord.WarehouseService;
import com.yonyou.iuap.corp.demo.entity.YonSuite.purinrecord.PurinrecordSaveEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/9/28
 * @des  仓库测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WarehouseTest {

    @Autowired
    WarehouseService purinrecordService;

    @Test
    public  void list() throws Exception {
        purinrecordService.list(null);
    }

}

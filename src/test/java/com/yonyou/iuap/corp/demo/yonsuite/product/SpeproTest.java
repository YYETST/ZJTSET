package com.yonyou.iuap.corp.demo.yonsuite.product;

import com.yonyou.iuap.corp.demo.api.V1.YonSuite.product.SpeproService;
import com.yonyou.iuap.corp.demo.entity.YonSuite.product.SpeproBodyEntity;
import com.yonyou.iuap.corp.demo.entity.YonSuite.product.SpeproHeadEntity;
import com.yonyou.iuap.corp.demo.entity.YonSuite.product.SpeproListEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/11
 * @des  物料规格测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpeproTest {

    @Autowired
    SpeproService speproService;

    /**
     * 获取物料规格列表
     */
    @Test
    public void getProductList() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        SpeproListEntity result = speproService.list(params);
        List<SpeproBodyEntity> data = result.getRecordList();
        //获取详情要用到
        System.out.println("id:"+data.get(0).getId());
    }


    /**
     * 获取物料规格详情
     */
    @Test
    public void getProductDetail() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("id","1648766442737920");
        SpeproHeadEntity result = speproService.detail(params);
        System.out.println(result.toString());
    }
}

package com.yonyou.iuap.corp.demo.yonsuite.product;

import com.yonyou.iuap.corp.demo.api.V1.YonSuite.product.ProclassService;
import com.yonyou.iuap.corp.demo.entity.YonSuite.product.ProClassListEntity;
import com.yonyou.iuap.corp.demo.entity.YonSuite.product.ProClassSaveEntity;
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
 * @des  物料分类测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProClassTest {

    @Autowired
    ProclassService proclassService;

    /**
     * 获取物料分类列表
     */
    @Test
    public void getProClassList() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("treename","pc.cls.ManagementClass");
        params.put("parent","12422");
        List<ProClassListEntity> result = proclassService.list(params);
        //获取物料分类详情需要用到
        System.out.println("id:"+result.get(0).getId());
    }


    /**
     * 获取物料分类详情
     */
    @Test
    public void getProClassDetail() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("id","1641547087630592");
        ProClassListEntity result = proclassService.detail(params);
        System.out.println(result.toString());
    }

    /**
     * 获取物料分类保存
     */
    @Test
    public void proClassSave() throws Exception {
        ProClassSaveEntity params = new ProClassSaveEntity("111","111");
        ProClassListEntity result = proclassService.save(params);
        System.out.println(result.toString());
    }
}

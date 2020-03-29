package com.yonyou.iuap.corp.demo.yonbip;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.UserInfoListService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.UspaceServie;
import com.yonyou.iuap.corp.demo.entity.yonbip.UserInfoPEntity;
import com.yonyou.iuap.corp.demo.entity.yonbip.UspaceListEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/3/29
 * @des  获取应用服务列表
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UspaceListTest {

    @Autowired
    UspaceServie uspaceServie;

    /**
     * 获取应用服务列表
     */
    @Test
    public void getUspaceListList() throws Exception {
        List<UspaceListEntity> result = uspaceServie.list();
        System.out.println(result.toString());
    }

}

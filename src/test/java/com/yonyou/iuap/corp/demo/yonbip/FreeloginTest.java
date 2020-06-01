package com.yonyou.iuap.corp.demo.yonbip;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.FreeloginService;
import com.yonyou.iuap.corp.demo.entity.yonbip.OtherLoginEntity;
import com.yonyou.iuap.corp.demo.entity.yonbip.UserInfoPEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/4/15
 * @des 免登测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FreeloginTest {

    @Autowired
    FreeloginService freeloginService;

    /**
     * 免登接口
     * @throws Exception
     */
    @Test
    public void freeLogin() throws Exception {
        OtherLoginEntity result = freeloginService.otherLoginTest("b11d777f0f5930e590b21112c8ca5eb77a8ef58b88d5ca036b2b40d9608c&qzId=152676");
        System.out.println(result.toString());
    }
}

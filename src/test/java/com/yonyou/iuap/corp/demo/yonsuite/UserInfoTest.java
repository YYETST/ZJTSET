package com.yonyou.iuap.corp.demo.yonsuite;

import com.yonyou.iuap.corp.demo.api.V1.YonSuite.UserInfoService;
import com.yonyou.iuap.corp.demo.entity.YonSuite.UserInfoEntity;
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
 * @des  员工信息测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoTest{

    @Autowired
    private UserInfoService userInfo;

    /**
     * 根据手机号获取员工信息
     */
    @Test
    public void getOrgDetail() throws Exception {
        Map<String, Object> params  = new HashMap<String, Object>();
        params.put("field","18810487612");
        List<UserInfoEntity> result = userInfo.detail(params);
        System.out.println(result.toString());
    }
}


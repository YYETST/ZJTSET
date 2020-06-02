package com.yonyou.iuap.corp.demo.yonbip.uspace;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiAccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiStaffService;
import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.StaffPageParam;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: corp-demo
 * @description: 员工相关接口测试类
 * @author: kw
 * @create: 2020/04/07 13:40
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StaffTest {


    @Autowired
    private ApiStaffService apiStaffService;
    @Autowired
    private ApiAccessTokenService apiAccessTokenService;

    /**
     * @description:  根据手机号或者邮箱查询员工
     * @author: kw
     * @date: 2020/4/7
     * @param: []
     * @return: void
     */
    @Test
    public void info_by_mobile_email() throws Exception {
        String type = "1";
        String field = "17352777151";// "17352777151";
        String result = apiStaffService.searchStaffByMobileOrEmail(type, field, apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }

    /**
     * @description: 分页查询当前租户员工列表
     * @author: kw
     * @date: 2020/4/19
     * @param: []
     * @return: void
     */
    @Test
    public void getStaffPageList() throws Exception {
        StaffPageParam staffPageParam = new StaffPageParam();
        staffPageParam.setIndex(1);
        staffPageParam.setSize(10);
        String result = apiStaffService.getStaffPageList(staffPageParam, apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }

    @Test
    public void info_by_id() throws Exception {
        String id = "";
        String result = apiStaffService.info_by_id(id, apiAccessTokenService.getAccessToken());
        System.out.println(result);
    }
}

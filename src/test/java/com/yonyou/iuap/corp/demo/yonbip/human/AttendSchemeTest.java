package com.yonyou.iuap.corp.demo.yonbip.human;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.human.AttendSchemeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/8/5
 * @des  假勤管理测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AttendSchemeTest {

    @Autowired
    AttendSchemeService attendSchemeService;

    /**
     * 获取假勤方案
     * @throws Exception
     */
    @Test
    public void attendScheme() throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        String result = attendSchemeService.attendScheme(params);
        System.out.println(result);
    }


    /**
     * 获取日报
     * @throws Exception
     */
    @Test
    public void attendDayRpt() throws Exception {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("schemeId","54f85987c609454c9d0c56f110372cb9");
        params.put("beginDate","1596215133000");
        params.put("endDate","1596294333000");
        params.put("pageNum",1);
        params.put("pageSize",100);
        String result = attendSchemeService.attendDayRpt(params);
    }
}

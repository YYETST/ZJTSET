package com.yonyou.iuap.corp.demo.yonbip.uspace;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.AccessTokenService;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace.ApiJobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @program: corp-demo
 * @description: 职位相关接口测试
 * @author: kw
 * @create: 2020/04/07 14:39
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class JobTest {

    @Autowired
    private ApiJobService apiJobService;
    @Autowired
    private AccessTokenService accessTokenService;

    /**
     * @description:根据id查询职位信息
     * @author: kw
     * @date: 2020/4/7
     * @param: []
     * @return: void
     */
    @Test
    public void jobpost_by_id() throws Exception {
        //post_id 可以根据手机号或者邮箱查询员工接口 获取
        String post_id = "610b096b36524d688263c7b15ff54c3a";
        String result = apiJobService.jobpost_by_id(accessTokenService.getAccessToken(),post_id);
        System.out.println(result);
    }

    /**
     * @description:根据id查询职务信息
     * @author: kw
     * @date: 2020/4/7
     * @param: []
     * @return: void
     */
    @Test
    public void job_by_id() throws Exception {
        //job_id 可以根据手机号或者邮箱查询员工接口 获取
        String job_id = "7947c3f3191a44eca6c4a0e0fa95ac83";
        String result = apiJobService.job_by_id(accessTokenService.getAccessToken(),job_id);
        System.out.println(result);
    }
}

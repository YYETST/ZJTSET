package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: corp-demo
 * @description: 职位接口相关Service
 * @author: kw
 * @create: 2020/04/07 14:22
 */
@Service
public class ApiJobService {

    private static final Logger logger = LoggerFactory.getLogger(ApiUserService.class);

    @Value("${api.uspace.job.jobpost_by_id}")
    private String JOB_POST_BY_ID_URL;
    @Value("${api.uspace.job.job_by_id}")
    private String JOB_BY_ID_URL;

    /**
     * @description:根据id查询职位信息
     * @author: kw
     * @date: 2020/4/7
     * @param: [accessToken, id]
     * @return: java.lang.String
     */
    public String jobpost_by_id(String accessToken,String id) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("access_token", accessToken);
        params.put("id", id);
        String result = HttpClientUtil.get(JOB_POST_BY_ID_URL,params);
        logger.info("jobpost_by_id result:{}", result);
        return result;
    }

    /**
     * @description:根据id查询职务信息
     * @author: kw
     * @date: 2020/4/7
     * @param: [accessToken, id]
     * @return: java.lang.String
     */
    public String job_by_id(String accessToken,String id) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("access_token", accessToken);
        params.put("id", id);
        String result = HttpClientUtil.get(JOB_BY_ID_URL,params);
        logger.info("job_by_id result:{}", result);
        return result;
    }


}

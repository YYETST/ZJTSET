package com.yonyou.iuap.corp.demo.api.V1.YonBip.uspace;

import com.yonyou.iuap.corp.demo.entity.yonbip.uspace.StaffPageParam;
import com.yonyou.iuap.corp.demo.utils.HttpClientConfig;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 员工接口
 */
@Service
public class ApiStaffService {

    private static final Logger logger = LoggerFactory.getLogger(ApiStaffService.class);

    private final static String URL_STAFF_PAGE_LIST = "/open/diwork/staff/page_list";

    private final static String URL_SEARCH_STAFF= "/open/diwork/staff/info_by_mobile_email";

    @Value("${api.host}")
    private String apiHost;

    @Value("${api.uspace.staff.info_by_id}")
    private String INFO_BY_USERID;

    /**
     * 分页查询当前租户员工列表
     * @param staffPageParam
     * @param accessToken
     * @return
     * @throws Exception
     */
    public String getStaffPageList(StaffPageParam staffPageParam, String accessToken) throws Exception{
        String requestUrl = apiHost + URL_STAFF_PAGE_LIST + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl,staffPageParam,new HttpClientConfig[0]);
        logger.info("getStaffPageList result:{}", result);
        return result;
    }

    /**
     * 根据手机号或者邮箱查询员工
     * @param accessToken
     * @param type 查询类型：1-手机，2-邮箱
     * @param field 查询值
     * @return
     * @throws Exception
     */
    public String searchStaffByMobileOrEmail(String type,String field,String accessToken) throws Exception{
        Map<String, Object> params = new HashMap<>();
        params.put("access_token", accessToken);
        params.put("type", type);
        params.put("field", field);
        String requestUrl = apiHost + URL_SEARCH_STAFF;
        String result = HttpClientUtil.get(requestUrl,params);
        logger.info("searchStaffByMobileOrEmail result:{}", result);
        return result;
    }

    /**
     * @description: 根据员工id查询员工信息接口
     * @author: kw
     * @date: 2020/4/20
     * @param: [id, accessToken]
     * @return: java.lang.String
     */
    public String info_by_id(String id, String accessToken) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("access_token", accessToken);
        params.put("id", id);
        String result = HttpClientUtil.get(INFO_BY_USERID,params);
        logger.info("info_by_id result:{}", result);
        return result;
    }
}

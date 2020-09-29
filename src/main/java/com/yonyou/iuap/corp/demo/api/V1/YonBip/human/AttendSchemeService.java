package com.yonyou.iuap.corp.demo.api.V1.YonBip.human;

import com.fasterxml.jackson.core.type.TypeReference;
import com.yonyou.iuap.corp.demo.api.V1.BaseApi;
import com.yonyou.iuap.corp.demo.entity.YonSuite.product.ProClassListEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author nishch
 * @version 1.0
 * @date 2020/8/5
 * @des  假勤方案
 */
@Component
public class AttendSchemeService extends BaseApi {
    //获取假勤方案
    @Value("${api.hrcloud.attendScheme}")
    private String attendScheme;
    //获取日报
    @Value("${api.hrcloud.attendDayRpt}")
    private String attendDayRpt;

    /**
     * 获取假勤方案
     * @param params
     * @return
     */
    public String attendScheme(Map<String, Object> params) throws Exception {
        String result = doGet(attendScheme,params);
        return result;
    }

    /**
     * 获取日报
     * @param params
     * @return
     */
    public String attendDayRpt(Map<String, Object> params) throws Exception {
        String result = doGet(attendDayRpt,params);
        return result;
    }
}

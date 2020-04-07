package com.yonyou.iuap.corp.demo.api.V1.YonBip.basicFiles.organization;

import com.yonyou.iuap.corp.demo.entity.yonbip.basicFiles.org.OrgStaffEntity;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.AccessTokenService;
import com.yonyou.iuap.corp.demo.utils.HttpClientUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @program: corp-demo
 * @description: 组织员工专项接口
 * @author: kw
 * @create: 2020/04/07 11:02
 */
@Service
public class OrgStaffService {

    private static final Logger logger = LoggerFactory.getLogger(AccessTokenService.class);

    @Value("${api.common.listParentAndSubByOrgIds}")
    private String ORG_STAFF_URL;

    public String listParentAndSubByOrgIds(String accessToken, OrgStaffEntity orgStaffEntity) throws Exception {
        String requestUrl = ORG_STAFF_URL + "?access_token=" + accessToken;
        String result = HttpClientUtil.jsonPost(requestUrl, orgStaffEntity);
        logger.info("listParentAndSubByOrgIds:{}", result);
        return result;
    }
}

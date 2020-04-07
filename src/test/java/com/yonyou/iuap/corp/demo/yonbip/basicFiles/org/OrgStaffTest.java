package com.yonyou.iuap.corp.demo.yonbip.basicFiles.org;

import com.yonyou.iuap.corp.demo.api.V1.YonBip.basicFiles.organization.OrgStaffService;
import com.yonyou.iuap.corp.demo.entity.yonbip.basicFiles.org.OrgStaffEntity;
import com.yonyou.iuap.corp.demo.api.V1.YonBip.AccessTokenService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: corp-demo
 * @description:
 * @author: kw
 * @create: 2020/04/07 11:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrgStaffTest {

    @Autowired
    private OrgStaffService orgStaffService;

    @Autowired
    private AccessTokenService accessTokenService;

    /**
     * @description:组织员工专项接口
     * @author: kw
     * @date: 2020/4/7
     * @param: []
     * @return: void
     */
    @Test
    public void listParentAndSubByOrgIds() throws Exception {
        OrgStaffEntity orgStaffEntity = new OrgStaffEntity();
        orgStaffEntity.setHasAllParent(true);
        orgStaffEntity.setHasAllSub(true);
        List orgids = new ArrayList();
        orgids.add("3d87c37406c0474498ec4c24c5a62132");
        orgStaffEntity.setOrgIds(orgids);
        String result = orgStaffService.listParentAndSubByOrgIds(accessTokenService.getAccessToken(),orgStaffEntity);
        System.out.println(result);
    }
}

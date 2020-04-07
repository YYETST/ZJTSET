package com.yonyou.iuap.corp.demo.entity.yonbip.basicFiles.org;

import java.util.List;

/**
 * @program: corp-demo
 * @description:
 * @author: kw
 * @create: 2020/04/07 11:07
 */
public class OrgStaffEntity {

    private boolean hasAllParent;
    private boolean hasAllSub;
    private List orgIds;

    public boolean isHasAllParent() {
        return hasAllParent;
    }

    public void setHasAllParent(boolean hasAllParent) {
        this.hasAllParent = hasAllParent;
    }

    public boolean isHasAllSub() {
        return hasAllSub;
    }

    public void setHasAllSub(boolean hasAllSub) {
        this.hasAllSub = hasAllSub;
    }

    public List getOrgIds() {
        return orgIds;
    }

    public void setOrgIds(List orgIds) {
        this.orgIds = orgIds;
    }
}

[TOC]

## 企业自建应用demo

### 1 使用说明

- 该demo为springboot项目，在resources/application.properties里面配置<font color=#FF0000 > `app.key` `app.secret` `app.code`</font> 三个参数，启动CorpDemoApplication 即可测试。

- 参考文档url： https://open.diwork.com/#/doc-center

### 2 YonSuite 接口示例

### 3 YonBIP 接口示例

#### 3.1 协同云--调用接口顺序：

- 只调用接口的情况(适用于消息、待办等在自己应用服务器调接口的情况)
	  查看租户id-->获取token接口-->获取用户列表-->其它业务接口

- 使用用友控制台、移动友空间、桌面友空间等需要点击操作的情况
	  获取token-->应用免登-->其它业务

- 常用获取员工信息接口流程
	  获取token接口-->免密登录接口-->根据手机号或者邮箱查询员工-->根据id查询职位信息
	  示例参考StaffTest.java 和 JobTest.java 以及 OrgStaffTest.java

### 4 常见问题

#### 4.1 如何获取code

- 在用友的系统中打开自建应用时，会给填写的url上拼写参数code，从request中获取即可
查看测试UserInfoListTest

#### 4.2 不登陆如何获取租户id

- 一个租户的租户id是不会变的，直接写死即可

#### 4.3 有些接口的appId或者ykjId怎么获取

- 查看测试类UspaceListTest


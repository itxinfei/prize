## 红包雨场景实战
假设公司要开年会，让你设计一套红包雨项目，在某段时间内随机发放不同的礼品，你该如何设计呢？本项目实现了一个完整的红包雨模式抽奖系统，
包括管理后台与前端界面。该项目由管理后台配置相关活动和奖品等信息，前端用户通过参与活动，完成抽奖。​

#### 交流方式：
QQ技术交流群：863662849<a target="_blank" href="https://qm.qq.com/cgi-bin/qm/qr?k=9yLlyD1dRBL97xmBKw43zRt0-6xg8ohb&jump_from=webapi">
<img border="0" src="//pub.idqqimg.com/wpa/images/group.png" alt="Java项目交流+求职面试" title="Java项目交流+求职面试"></a><a target="_blank" href="http://mail.qq.com/cgi-bin/qm_share?t=qm_mailme&email=f0hLSE9OTkdHTT8ODlEcEBI" style="text-decoration:none;"><img src="http://rescdn.qqmail.com/zh_CN/htmledition/images/function/qm_open/ico_mailme_02.png"/></a>

### 红包雨项目要求
- 并发性
- 库存控制
- 投放策略
- 边界控制
- 活动自由配置
- 中奖策略

### 一、项目展示
登录页面
![输入图片说明](https://images.gitee.com/uploads/images/2020/0811/152144_1eff802c_800553.png "屏幕截图.png")
后台页面
![输入图片说明](https://images.gitee.com/uploads/images/2020/0811/152255_1abbac05_800553.png "屏幕截图.png")
![输入图片说明](https://images.gitee.com/uploads/images/2020/0811/152234_3627eff1_800553.png "屏幕截图.png")	

### 二、大纲章节
- 01 业务场景介绍
电商活动、红包雨、企业年会等实战场景分析；系统要求分析：并发性、库存控制、投放策略、边界控制、活动自由配置、中奖策略

- 02 功能展示
系统功能与需求分析；管理后台基本功能展示；前台抽奖展示

- 03 系统所用中间件介绍
redis介绍与数据类型；redis在项目的实战应用；zookeeper节点分析；配置中心及集群高可用介绍；rabbitmq的实战与控制台；nginx动静分离及负载均衡应用
			 
- 04 数据库建模
ER图展示与业务建模分析；数据库表设计；报表统计逻辑分析；使用辅助工具快速创建视图

- 05 系统概要设计
业务分析与功能模块拓扑；软件架构与微服务体系；软件设计原则讲解；缓存结构设计；主业务交互UML序列图
			 
- 06 管理后台框架选型
基于docker实现中间件快速搭建启动；管理后台框架选型；快速开发平台介绍与基本使用；角色用户及功能权限配置

- 07 微服务拆分与搭建
前端模块分析与拆分；maven基本结构搭建；微服务框架集成；中间件集成与搭建：zookeeper，redis，rabbitmq，elastic-job，连接池，mybatis

- 08 辅助开发工具集成与使用
代码机mybatis-generator，分页工具PageHelper，zookeeper管理工具zkui，api文档集成swagger2

- 09 活动预热主业务实现
缓存结构设计回顾；预热与缓存加载实现；过期时间控制；调度策略；elastic-job实战

- 10 抽奖业务实现与技巧
中奖次数与redis原子性控制；redis+Lua脚本实现原子性；奖池令牌桶设计与中奖验证；rabbitmq的实战应用；中奖信息的异步处理

- 11 微服务部署与Devops
服务器部署拓扑分析；jenkins持续集成与shell脚本；nginx动静分离配置；springboot镜像打包；docker-swarm实现服务的弹性扩容

- 12 课程总结与引申
jmeter压测工具使用；发散思维之活动暂停功能；业务引申之如何实现其他发放算法；抽奖类课程设计总结

### 三、课程亮点
课程亮点
- 1· 高并发性：借助redis高性能及存储结构的多样性，实现活动信息的预热，为前端接口提供高并发支撑。抽奖奖池采用令牌桶设计，保障奖品库存的准确性。
- 2· 异步处理：应用消息队列，将抽奖中奖流程异步处理，不影响抽奖主流程对前端用户请求的响应。
- 3· 微服务化：基于springcloud构建系统，实现微服务化，各个子模块灵活部署，解除耦合。
- 4· 持续集成：基于jenkins shell脚本及docker-swarm构建持续集成。打包发布一键完成，swarm可以轻松做到资源的弹性伸缩及滚动更新。

### 四、学习目标
- 1·了解系统的功能、背景、场景及项目要求
- 2·在架构角度思索系统可能面临的问题以及解决方案
- 3·学习本项目所涉及的中间件等基础知识
- 4·能够从0搭建springcloud微服务系统框架
- 5·能够完成编码，使用中间件完成系统的业务代码
- 6·学会部署上线，学会基于jenkins+docker swarm实现微服务的持续集成与动态扩容

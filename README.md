# 红包雨
### 一、介绍

![输入图片说明](https://images.gitee.com/uploads/images/2020/0811/151300_85568341_800553.jpeg "红包雨.jpg")

假设公司要开年会，让你设计一套红包雨项目，在某段时间内随机发放不同的礼品，你该如何设计呢？本项目实现了一个完整的红包雨模式抽奖系统，包括管理后台与前端界面。该项目由管理后台配置相关活动和奖品等信息，前端用户通过参与活动，完成抽奖。
​	

### 二、后台管理backend

1.   下载backend项目，并导入idea中
2.   导入resources下的sql到数据库中，并在pom文件的profile中配置数据库信息
   (导入时会有几个视图无法创建，可以直接复制sql文件的视图语句到数据库中直接创建即可)
3.   启动
4.   http://localhost:8888

### zkui zookeeper的ui界面
    1、在config.cfg中配置地址zkServer(根据自己的实际情况)
    2、serverPort为ui界面访问端口,默认是 localhost:9090
    3、修改配置后,更新配置到zkui.jar文件中, 使用命令: jar uvf zkui.jar config.cfg
    4、运行: java -jar zkui.ar

# hongdouoj-backend-microservice

#### 介绍
OJ 编程题目测评系统。
基于Spring Boot Cloud微服务 + MQ + Docker（+Vue3 + Arco + Design)编程题目测评系统。
在系统前台，管理员可以创建、管理题目；用户可以自由搜索题目、阅读题目、编写并提交代码。
在系统后端，能够根据管理员设定的题目测试用例在 **自主实现的代码沙箱** 中对代码进行编译、运行、判断输出是否正确。
其中，代码沙箱可以作为独立服务，提供给其他开发者使用。

#### 软件架构
![输入图片说明](https://foruda.gitee.com/images/1730272241255441275/171eb0bd_13041225.png "屏幕截图")


#### 核心业务流程
![输入图片说明](https://foruda.gitee.com/images/1730272270286943059/568aabda_13041225.png "屏幕截图")


#### 时序图
![image](https://github.com/user-attachments/assets/a29d9470-c25b-4c5d-a841-b0c82810b198)



#### 技术选型
后端：
- Java Spring Cloud +Spring Cloud Alibaba微服务
    - Nacos注册中心
    - Open Feign客户端调用
    - GateWay网关
    - knife4j聚合文档
- Java Spring Boot (自研后端万用模板）
- Java进程控制
- Java安全管理器
- Docker代码沙箱实现
- 虚拟机+远程开发
- MYSQL数据库
- MyBatis Plus及MyBatis PlusX自动生成
- Redis分布式Sesion
- RabbitMq消息队列
- 多种设计模式
     - 策略模式
     - 工厂模式
     - 代理模式
     - 其他模板方法
- 其他：部分并发编程、JVM 小知识

前端：
- Vue3
- Vue-CLI脚手架
- VUex状态管理
- Arco Dseign组件库
- 前端工程化：Eslint + Prettier + TypeScript
- 手写前端项目模板（通用布、权限管理、状态管理、菜单生成）
- Markdown富文本编辑器
- Monaco Editor代码编辑器
- OpenAPI 前端代码生成


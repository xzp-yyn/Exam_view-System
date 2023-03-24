# 在线考试系统（Online examination system, Created by SpringBoot framework）

## 项目介绍

在线考试系统后端使用SpringBoot+Mybatis，前端使用Vue+ElementUI，数据库使用MySQL。

前端工程：

## 环境介绍

| 名称     | 描述                                       |
| ------ | ---------------------------------------- |
| Java版本 | JDK 11                                |
| IDE工具  | IntelliJ IDEA 2021.2.1(Ultimate Edition) |
| 构建工具   | Maven 3.3.9                              |
| Web服务器 | SpringBoot内嵌的Tomcat                      |
| 数据库    | MySQL 5.7                                |

## 运行步骤

1. 数据库导入，新建数据库exam，将`exam.sql`文件导入并运行。
2. 打开项目，打开`src/main/resources/baseApplication.yaml`，修改配置文件，并将文件名改为application.yaml。
   1. 配置 MySQL 数据库
   2. 配置 Redis
3. 运行后端工程。
   1. SpringBoot 工程运行
4. 运行前端工程。
   1. `npm install`
   2. `npm run dev`

## 项目截图

登录界面

![1](http://wangpeng-imgsubmit.oss-cn-hangzhou.aliyuncs.com/img/202205111254004.png)

题目管理

![2](http://wangpeng-imgsubmit.oss-cn-hangzhou.aliyuncs.com/img/202205111255314.png)

组卷界面

![3](http://wangpeng-imgsubmit.oss-cn-hangzhou.aliyuncs.com/img/202205111256158.png)

考试界面

![4](http://wangpeng-imgsubmit.oss-cn-hangzhou.aliyuncs.com/img/202205111257098.png)

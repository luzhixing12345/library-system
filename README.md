图书和论文管理系统
---

## Introduction:

本项目为武汉大学2019级计算机弘毅班"数据库系统实现"课程的第一次大作业(图书和论文管理系统)的代码实现<br>

组名: 啊对对对<br>
- 组长:陆知行
- 组员:孙含笑
- 组员:陶文琪
- 组员:徐梓峻

## Install:
- java8
  - [Java JDK下载与安装教程](http://c.biancheng.net/view/1286.html)
  - [Java JDK环境变量配置](http://c.biancheng.net/view/1290.html)
- maven
  - [maven的安装与环境变量配置](http://c.biancheng.net/maven2/install-configure.html)


## Use:
- step1: database setting
  - 默认用户已修改config文件,创建用户 密码
  - 启动数据库
    ```shell
    su - omm
    gs_ctl start -D /opt/software/openGauss/data -Z single_node -l logfile
    ```
  - 将`./library.sql`,`./delete.sql`传入服务器某一文件夹下,例(opt/software/),SQL导入数据
  
    ```shell
    gsql -d postgres -p 5432 -r -f /opt/software/library.sql > /opt/software/library.log
    ```
    删除数据
    ```shell
    gsql -d postgres -p 5432 -r -f /opt/software/delete.sql > /opt/software/delete.log
    ```
    sql中已经添加了权限
- step2: run
  ```shell
  mvn clean compile
  mvn clean package
  mvn clean install
  mvn jetty:run
  localhost:8080
  ```

## Document: 
设计思路+功能实现[文档](./Document.md)


## 一些踩过的坑
- https://www.cnblogs.com/chenghu/p/13912969.html



图书和论文管理系统
---

## Introduction:

本项目为武汉大学2019级计算机弘毅班"数据库系统实现"课程的第一次大作业(图书和论文管理系统)的代码实现<br>

组名: 啊对对对<br>
- 组长:陆知行 -> 前端代码修改,后端代码修改,数据库结构设计,数据库调通
- 组员:孙含笑 -> 前端代码修改,后端代码修改,数据库结构设计,数据库调通
- 组员:陶文琪 -> 文档撰写
- 组员:徐梓峻 -> 文档撰写

## Install:
- java8
  - [Java JDK下载与安装教程](http://c.biancheng.net/view/1286.html)
  - [Java JDK环境变量配置](http://c.biancheng.net/view/1290.html)
- maven
  - [maven的安装与环境变量配置](http://c.biancheng.net/maven2/install-configure.html)


## Use:
- step1: database setting
  - 默认用户已修改config文件,创建用户 密码,默认安装路径为`opt/software`
  - 请修改[数据库配置文件](src\main\resources\db.properties),修改为你的用户名(user),数据库名(postgres),密码(password),弹性公网IP
  - 启动数据库
    ```shell
    su - omm
    gs_ctl start -D /opt/software/openGauss/data -Z single_node -l logfile
    ```
  - 将`./library.sql`,`./delete.sql`传入服务器某一文件夹下,例(opt/software/),SQL导入数据
    >其中`library.sql`内为所有的SQL语句,包括创建表,导入初始数据等,`delete.sql`为删除表操作,当然你可以新建数据库 `library`然后直接`drop database library`也可以,本文采用删除数据库中的表的形式,默认数据库名为(postgres),端口号5432<br>
    >关于 `BIGSERIAL`,该用法为自增,参考[网站](https://www.w3cschool.cn/qysrc/qysrc-6ea8376f.html)<br>$$
    >**opengauss与mysql数据库写法不同,需要更改语句,不能直接使用**<br>  

    ```shell
    gsql -d postgres -p 5432 -r -f /opt/software/library.sql > /opt/software/library.log
    ```
    删除数据
    ```shell
    gsql -d postgres -p 5432 -r -f /opt/software/delete.sql > /opt/software/delete.log
    ```
    sql中已经添加了权限,**请更改`library.sql`的最后两行为你创建的用户的名字**
- step2: run
  - 第一次使用
    ```shell
    mvn clean install
    mvn jetty:run
    localhost:8080
    ```
  - 之后的使用
    ```shell
    mvn clean install #没有更改java代码不需要重新执行此项,更改jsp代码无影响
    mvn jetty:run
    localhost:8080
    ```
## Document: 
设计思路+功能实现[文档](./Document.md)

## Shortcoming:
- 小组成员中均无前端后端代码编写经验,本项目借鉴并重写了[GitHub项目](https://github.com/zhanghuanhao/LibrarySystem),并对其前端界面做出优化,但由于水平有限仍无法做到美观兼顾好用
- 该项目的css文件过于冗长且集中,部分html界面结构设计不合理,没有做到对齐|字体|等大
- 没有对输入做正则判断,默认接受所有用户的输入,可能会由于用户的异常输入导致sql超出数据大小异常或者不合理的数据输入也没有做判断,希望后期能有人作出改进
- 本项目并没有做上传下载服务器,该下载方法为将文件上传至` github.realse`然后再提供链接,本质上是一个掩耳盗铃的行为,由于水平有限时间有限未能很好地完成该功能.希望后期能有人改进

## 一些踩过的坑
- 调试过程中需要浏览器加载网页,浏览器有缓存,一些图片的更换/css代码的更改,可能直接F5刷新没有反应,需要清除浏览器缓存之后(Google-> ctrl+shift+del)重加载
- https://www.cnblogs.com/chenghu/p/13912969.html
- 使用opengauss数据库,需要在`pom.xml`中加入,插入到任意dependeny位置皆可(本项目已加)
  ```shell
        <dependency>
            <groupId>com.huaweicloud.dws </groupId>
            <artifactId>huaweicloud-dws-jdbc</artifactId>
            <version>8.1.0</version> 
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.2.7</version>
        </dependency>
  ```


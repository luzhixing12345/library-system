# 图书和论文管理系统设计文档

## 设计
- 前端框架 `bootstrap` + `jQuery`
- 后端框架 `springboot`+`MyBatis`
- 项目管理工具 `maven`
- 数据库 `openGauss`

## 图书
- 基本属性:
  - book_id(primary key)
  - 书名 作者 出版社 ISBN号 简介 语言 价格 出版时间 分类 剩余数量
  - SQL信息
    ```shell
    CREATE TABLE book_info (
  	book_id BIGSERIAL PRIMARY KEY,
  	name VARCHAR ( 50 ) NOT NULL,
  	author VARCHAR ( 50 ) NOT NULL,
  	publish VARCHAR ( 50 ) NOT NULL,
  	ISBN VARCHAR ( 15 ) NOT NULL,
  	introduction text,
  	language VARCHAR ( 20 ) NOT NULL,
  	price DECIMAL ( 10, 2 ) NOT NULL,
  	pub_date date NOT NULL,
  	class_id INT DEFAULT NULL,
  	number INT DEFAULT NULL 
    );
    ```
  - 可被管理员(admin)添加/删除/修改信息,可被读者借阅/归还/查询

- 功能实现
  - [bean](src\main\java\com\library\bean\Book.java)
  - [controller](src\main\java\com\library\controller\BookController.java)
  - [dao](src/main/java/com/library/dao/BookDao.java)
  - [页面jsp](src\main\webapp\WEB-INF\jsp)



- [SQL增删改查代码](src\main\resources\MyBatis\book.xml),包括编辑图书信息,**模糊搜索**(书名/简介中任何出现的字都会被搜索到)
- [SQL借阅/归还信息](src\main\resources\MyBatis\lend.xml)

## 论文
- 基本属性
  - paper_id(primary key)
  - 论文名 作者 机构 年份 页数 简介 期数 卷数 DOI号(下载链接)
  - SQL信息
    ```shell
    CREATE TABLE paper_info (
    	paper_id BIGSERIAL PRIMARY KEY,
    	name VARCHAR ( 200 ) NOT NULL,
    	author VARCHAR ( 50 ) NOT NULL,
    	publish VARCHAR ( 200 ) NOT NULL,
    	year VARCHAR ( 15 ) NOT NULL,
    	page VARCHAR ( 25) NOT NULL,
    	introduction text,
    	no VARCHAR ( 20 ),
    	vol VARCHAR ( 20 ),
    	doi VARCHAR (200)
    );
    ```
  - 可被管理员(admin)添加/删除/修改信息,可被读者查阅,可以下载论文

- 功能实现
  - [bean](src\main\java\com\library\bean\Paper.java)
  - [controller](src\main\java\com\library\controller\PaperController.java)
  - [dao](src/main/java/com/library/dao/PaperDao.java)
  - [页面jsp](src\main\webapp\WEB-INF\jsp)

- [SQL增删改查代码](src\main\resources\MyBatis\paper.xml),包括编辑论文信息,**模糊搜索**(书名/简介中任何出现的字都会被搜索到)

## 用户账户
- 账户信息
  - 基本属性
    - reader_id(primary key)
    - 姓名 性别 出生日期 地址 电话
    - SQL信息
      ```shell
      CREATE TABLE reader_info (
      	reader_id BIGSERIAL PRIMARY KEY,
      	name VARCHAR ( 50) NOT NULL,
      	reader_type VARCHAR(15),
      	sex VARCHAR ( 20 ) NOT NULL,
      	birth date NOT NULL,
      	address VARCHAR ( 50 ) NOT NULL,
      	phone VARCHAR ( 15 ) NOT NULL 
      );
      ```
    - 由用户编辑/修改
  - 功能实现
    - [bean](src\main\java\com\library\bean\ReaderInfo.java)
    - [controller](src\main\java\com\library\controller\ReaderController.java)
    - [dao](src\main\java\com\library\dao\ReaderInfoDao.java)
    - [页面jsp](src\main\webapp\WEB-INF\jsp)
  
  - [SQL账户信息](src\main\resources\MyBatis\readerInfo.xml)

- 登录账号
  - 基本属性
    - reader_id(primary key)
    - 用户名 密码
    - SQL信息
      ```shell
      CREATE TABLE reader_card (
      reader_id BIGSERIAL PRIMARY KEY,
      username VARCHAR ( 15 ) NOT NULL,
      password VARCHAR ( 15 ) NOT NULL
      );
      ```
    - 由用户注册/修改密码
  - 功能实现
    - [bean](src\main\java\com\library\bean\ReaderCard.java)
    - [controller](src\main\java\com\library\controller\ReaderController.java)
    - [dao](src\main\java\com\library\dao\ReaderCardDao.java)
    - [页面jsp](src\main\webapp\WEB-INF\jsp)
  
  - [SQL登录账号信息](src\main\resources\MyBatis\readerCard.xml)

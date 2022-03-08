# 图书和论文管理系统设计文档

## 设计
- 前端框架 `jsp`
- 后端框架 `springboot`
- 项目管理工具 `maven`
- 数据库 `openGauss`

## 图书
- 基本属性:
  - url(primary key)
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
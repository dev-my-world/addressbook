# 创建数据库
CREATE DATABASE addressbook;
#使用创建的addressbook 数据库
USE addressbook;
#创建表
CREATE TABLE addressbook
(
  addressbookid INT AUTO_INCREMENT PRIMARY KEY,
  surname       VARCHAR(20) NULL,
  name          VARCHAR(20) NULL,
  company       VARCHAR(20) NULL,
  phone_number  VARCHAR(20) NULL,
  email         VARCHAR(20) NULL,
  address       VARCHAR(40) NULL,
  remark        VARCHAR(30) NULL
)
  ENGINE = InnoDB
  CHARSET = utf8;
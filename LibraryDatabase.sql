CREATE DATABASE LibraryDatabase;
USE LibraryDatabase;

CREATE TABLE UserInfo(
  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Username VARCHAR(20) NOT NULL,
  Password VARCHAR(50) NOT NULL
);

CREATE TABLE BookInfo(
  BookName VARCHAR(50) NOT NULL PRIMARY KEY,
  BookPath VARCHAR(100) NOT NULL
);

INSERT INTO BookInfo(BookName,BookPath) VALUES('CSSȨ��ָ��','/books/css.jpg');

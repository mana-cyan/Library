CREATE DATABASE LibraryDatabase;
USE LibraryDatabase;

CREATE TABLE UserInfo(
  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Username VARCHAR(20) NOT NULL,
  Password VARCHAR(50) NOT NULL,
  Rented VARCHAR(30),
  Admin INT NOT NULL DEFAULT 0
);

CREATE TABLE BookInfo(
  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  BookName VARCHAR(50) NOT NULL,
  BookAuthor VARCHAR(20) NOT NULL,
  BookInfo VARCHAR(200) NOT NULL,
  BookPath VARCHAR(100) NOT NULL,
  Storage INT DEFAULT 0,
  Rented VARCHAR(30)
);

CREATE TABLE Request(
  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  BookID INT NOT NULL,
  UserID INT NOT NULL,
  FromDate VARCHAR(20) NOT NULL,
  ToDate VARCHAR(20) NOT NULL
);

INSERT INTO BookInfo(BookName,BookAuthor,BookInfo,BookPath) VALUES
  ('CSSȨ��ָ��','Eric A.Meyer', '��CSSȨ��ָ�ϡ�ͨ�����ʾ������ϸ�����������������һ��������ʽ����ܴ������޸�������վ����ۣ��Լ���εõ�html�����ܼ��ĸ��ḻ�ı���Ч����ͬʱչʾ�������ѭcss���¹淶��css2��css2.1���������ʽ��ķ�������Ӧ����ʵ����','/books/css.jpg');
INSERT INTO BookInfo(BookName,BookAuthor,BookInfo,BookPath) VALUES
  ('JavaScriptȨ��ָ��','David Flanagan', '�����ǳ���Աѧϰ����JavaScript���Ժ���Web����������JavaScript API��ָ�Ϻ��ۺϲο��ֲᡣ��6�溭��HTML 5��ECMAScript 5���ܶ��½���ȫ��д���Ա���ʱ�����������������Web����ʵ����','/books/javascript.jpg');

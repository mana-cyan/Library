CREATE DATABASE LibraryDatabase;
USE LibraryDatabase;

CREATE TABLE UserInfo(
  ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Username VARCHAR(20) NOT NULL,
  Password VARCHAR(50) NOT NULL,
  Rented VARCHAR(30)
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
  BookID INT,
  UserID INT,
  FromDate VARCHAR(20) NOT NULL,
  ToDate VARCHAR(20) NOT NULL,
  Statu BIT NOT NULL,
  FOREIGN KEY (BookID) REFERENCES BookInfo(ID),
  FOREIGN KEY (UserID) REFERENCES Userinfo(ID)
);

INSERT INTO BookInfo(BookName,BookAuthor,BookInfo,BookPath) VALUES
  ('CSSȨ��ָ��','Eric A.Meyer', '��CSSȨ��ָ�ϡ�ͨ�����ʾ������ϸ�����������������һ��������ʽ����ܴ������޸�������վ����ۣ��Լ���εõ�html�����ܼ��ĸ��ḻ�ı���Ч����ͬʱչʾ�������ѭcss���¹淶��css2��css2.1���������ʽ��ķ�������Ӧ����ʵ����','/books/css.jpg');

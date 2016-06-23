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
  ('CSS权威指南','Eric A.Meyer', '《CSS权威指南》通过诸多示例，详细讲解了如何做到仅在一处建立样式表就能创建或修改整个网站的外观，以及如何得到html力不能及的更丰富的表现效果。同时展示了如何遵循css最新规范（css2和css2.1）将层叠样式表的方方面面应用于实践。','/books/css.jpg');

<%@ page import="com.ccnu.library.data.BookinfoEntity" %>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.ccnu.library.Utils" %>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="css/Theme.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
    <script language="JavaScript" src="js/jquery-2.2.4.min.js"></script>
    <script language="JavaScript" src="js/bootstrap.min.js"></script>
    <script language="JavaScript" src="js/HomePage.js"></script>
    <title>找到图书</title>
</head>
<body>
<jsp:include page="/WEB-INF/content/Head.jsp">
    <jsp:param name="pageTitle" value="library"/>
</jsp:include>
<div class="container">
    <div class="row">
        <!--封面-->
        <% BookinfoEntity book = Utils.getBookInfo();%>
        <div class="col-md-2" >
            <img src="<%=book.getBookPath()%>" width="110%" height="40%" style="margin-top: 50px"/><br>
        </div>
        <!--书籍信息输出-->
        <div class="col-md-5">
            <div style="margin-left: 20px;margin-top: 55px">
                <p style="font-size: 22px"><%=book.getBookName()%></p>
                <p style="font-size: 15px">
                    作者：<%=book.getBookAuthor()%><br>
                    简介：<%=book.getBookInfo()%>
                </p>
                <a href="RentBook"><button class="btn btn-primary" style="margin-top: 10%">借阅本书</button></a>
            </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

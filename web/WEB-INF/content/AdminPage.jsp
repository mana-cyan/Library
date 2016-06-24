<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.ccnu.library.Utils" %>
<%@ page import="java.util.List" %>
<%@ page import="com.ccnu.library.data.RequestEntity" %>
<%@ page import="com.ccnu.library.data.BookinfoEntity" %>
<%@ page import="com.ccnu.library.data.UserinfoEntity" %>
<html>
<head>
    <link href="css/Theme.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
    <script language="JavaScript" src="js/jquery-2.2.4.min.js"></script>
    <script language="JavaScript" src="js/bootstrap.min.js"></script>
    <script language="JavaScript" src="js/HomePage.js"></script>
    <title>获取请求</title>
</head>
<body>
<h3 align="center">请求信息审核</h3><br>
<table class="table table-bordered table-hover" id="tab2">
    <thead>
    <tr>
        <th>用户名</th>
        <th>借阅书名</th>
        <th>借阅时间</th>
        <th>归还时间</th>
        <th>审核</th>
    </tr>
    </thead>
    <%
        List<RequestEntity> list;
        list=Utils.getRequests();
        RequestEntity req;
        BookinfoEntity book;
        UserinfoEntity user;
    %>
    <tbody>

    <tr>
        <%
            for(int i = 0; i < list.size(); i++){
                req = list.get(i);
                book = Utils.getBookInfo(req.getBookId());
                user = Utils.getUserinfo(req.getUserId());
        %>
        <td><%=user.getUsername()%></td>
        <td><%=book.getBookName()%></td>
        <td><%=req.getFromDate()%></td>
        <td><%=req.getToDate()%></td>
        <td>
            <form action="CheckAction.action" method="post">
                <input type="hidden" name="requestID" value="<%=req.getId()%>">
                <input type="submit" class="btn-primary" value="批准"/>
                <input type="submit" class="btn-danger" value="拒绝"  onclick="this.form.action='CheckRefuse'"/>
            </form>
        </td>
    </tr>
    <%}%>
    </tbody>
</table>
</body>
</html>

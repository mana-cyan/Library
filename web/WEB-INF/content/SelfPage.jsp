<%@ page import="com.ccnu.library.data.UserinfoEntity" %>
<%@ page import="com.ccnu.library.Utils" %>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>
<head>
    <title>个人中心</title>
    <link href="css/Theme.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
    <script language="JavaScript" src="js/jquery-2.2.4.min.js"></script>
    <script language="JavaScript" src="js/bootstrap.min.js"></script>
    <script language="JavaScript" src="js/HomePage.js"></script>
</head>
<body>
    <jsp:include page="/WEB-INF/content/User.jsp">
        <jsp:param name="pageTitle" value="library"/>
    </jsp:include>

    <h1 style="margin: 3% 0 2% 5%;">已借书籍:</h1>

    <%
        UserinfoEntity user = Utils.getUserinfo();
        String rented = user.getRented();
        String[] books = new String[0];
        if(null != rented){
            books = rented.split("|");
        }

    %>
    <table style="margin-left: 5%;" class="table" >
        <%
            for(String b : books) {
        %>
        <%=b%>
        <%}%>
    </table>
</body>
</html>

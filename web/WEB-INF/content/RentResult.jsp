<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>借书结果</title>
</head>
<body>
    <%=ActionContext.getContext().getSession().get("fromDate")%>
</body>
</html>

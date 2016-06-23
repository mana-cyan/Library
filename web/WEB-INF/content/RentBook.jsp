<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍借阅</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
</head>
<body>
    <div style="margin-top: 20%;" align="center" class="form-group">
        <form action="RentAction.action" method="post">
            借书时间：<input type="date" name="fromDate"/><br/>
            还书时间：<input type="date" name="toDate"/><br/>
            <input type="submit" style="margin-top: 10px;" class="btn btn-primary" value="提交"/>
        </form>
    </div>
</body>
</html>

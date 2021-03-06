<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>

<head>
    <link href="css/Theme.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
    <script language="JavaScript" src="js/jquery-2.2.4.min.js"></script>
    <script language="JavaScript" src="js/bootstrap.min.js"></script>
    <script language="JavaScript" src="js/HomePage.js"></script>
    <title><s:text name="library"/></title>
</head>

<body>

<jsp:include page="/WEB-INF/content/Head.jsp">
    <jsp:param name="pageTitle" value="library"/>
</jsp:include>

<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
        <li data-target="#carousel-example-generic" data-slide-to="1"></li>
        <li data-target="#carousel-example-generic" data-slide-to="2"></li>
    </ol>

    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img src="images/explanation-1.jpg">
        </div>
        <div class="item">
            <img src="images/explanation-2.jpg">
        </div>
        <div class="item">
            <img src="images/explanation-3.jpg">
        </div>
    </div>

    <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

</body>
</html>

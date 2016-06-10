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

<jsp:include page="/WEB-INF/content/User.jsp">
    <jsp:param name="pageTitle" value="library"/>
</jsp:include>

<div>
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>

        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="images/explanation-1.png">
            </div>
            <div class="item">
                <img src="images/explanation-2.png">
            </div>
            <div class="item">
                <img src="images/explanation-3.png">
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
</div>

<div class="divMainFrame">
    <div class="tab">
        <s:text name="bookList"/>
    </div>
    <div class="bookshelf">
        <div class="bookList" align="center">
            <img class="prev" src="images/prev.png">
            <img id="book_1" class="book" src="books/css.jpg">
            <img id="book_2" class="book" src="books/javascript.jpg">
            <img class="next" src="images/next.png">
        </div>
    </div>
</div>

</body>
</html>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>

<head>
    <link href="css/Theme.css" rel="stylesheet" type="text/css"/>
    <script language="JavaScript" src="js/HomePage.js"></script>
    <title><s:text name="library"/></title>
</head>

<body class="background">

<div align="right" class="search">
    <s:form theme="simple" action="SearchAction">
        <s:textfield name="search" class="editText"/>
        <s:submit key="search" class="button"/>
    </s:form>
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

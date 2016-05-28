<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>

<head>
    <link href="css/Theme.css" rel="stylesheet" type="text/css"/>
    <title><s:text name="library"/></title>
</head>

<body class="background">

<div align="right" class="search">
    <s:textfield name="search" class="editText"/>
    <s:submit key="search" theme="simple" class="button"/>
    <s:submit key="login" theme="simple" class="button"/>
</div>

<div class="divMainFrame">
    <div class="tab">
        <s:text name="bookList"/>
    </div>
    <div class="bookshelf">
        <div class="books" align="center">
            <img class="prev" src="images/prev.png">
        </div>
    </div>
</div>

</body>
</html>

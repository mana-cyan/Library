<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<html>

<head>
    <link href="/css/Theme.css" rel="stylesheet" type="text/css"/>
    <title><s:text name="library"/></title>
</head>

<body class="background">

<div align="right" class="search">
    <s:textfield name="search" class="editText"/>
    <s:submit key="search" theme="simple" class="button"/>
    <s:submit key="login" theme="simple" class="button"/>
</div>

<div align="left" class="tab">
    <s:text name="bookList"/>
</div>

</body>
</html>

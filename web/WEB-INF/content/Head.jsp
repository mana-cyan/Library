<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<body>

<div align="right" class="search">

    <div style="float: right; line-height: 70px; font-size: 1px">
        <s:submit id="btnLogin" key="login" theme="simple" class="btn btn-default" onclick="Login()"/>
        <s:submit id="btnRegister" key="register" theme="simple" class="btn btn-default" onclick="Register()"/>
    </div>

    <div class="form-inline" style="float: right;">
        <form class="form-group" method="post" action="SearchAction.action">
            <input type="text" name="search" class="editText"/>
            <input type="submit" value="ËÑË÷" class="btn btn-default">
        </form>
    </div>
</div>


</body>
</html>

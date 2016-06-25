<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<body>

<div align="right" class="search">

    <div style="float: right; font-size: 20px; color: #ffffff; margin-right: 1%">
        <form style="margin-top: 16px; float: right" method="post" action="RoleAction.action">
            <%=ActionContext.getContext().getSession().get("username")%>
            <input style="margin-left: 10px" type="submit" class="btn btn-default" value="个人中心">
        </form>
    </div>

    <div class="form-inline" style="float: right;">
        <form class="form-group" method="post" action="SearchAction.action">
            <input type="text" name="search" class="editText"/>
            <input type="submit" value="搜索" class="btn btn-default">
        </form>
    </div>
</div>

</body>
</html>

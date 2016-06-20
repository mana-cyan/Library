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

<div class="top">
    <ul class="nav navbar-nav">
        <li><a href="HomePage"> <img src="images/home.png"></a></li>
        <li><a href="Permission"> <img src="images/books.png"></a></li>
        <li><a href="Personality"> <img src="images/person.png"></a></li>
    </ul>
</div>

<script type="text/javascript">
    window.onscroll = function(){
        var t=document.documentElement.scrollTop||document.body.scrollTop;
        var top=document.getElementById("UpToTop");
        if( t >= 20 ) {
            top.style.display = "inline";
        }
        else {
            top.style.display = "none";
        }
    }
</script>

<div id="UpToTop">
    <a href="#top" style="color: #b5b5b5"></br></br></br>·µ»Ø¶¥²¿</a>
</div>

</body>
</html>

<%@ page contentType="text/html;charset=GBK" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<body>

<div align="right" class="search">
    <s:textfield name="search" class="editText"/>
    <s:submit key="search" theme="simple" class="btn btn-default search-btn"/>
    <s:submit id="btnLogin" key="login" theme="simple" class="btn btn-default" onclick="Login()"/>
    <s:submit id="btnRegister" key="register" theme="simple" class="btn btn-default" onclick="Regist()"/>
</div>

<div class="top">
    <ul class="nav navbar-nav">
        <li><a href="HomePage"> <img src="images/home.png"></a></li>
        <li><a href="Books"> <img src="images/books.png"></a></li>
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

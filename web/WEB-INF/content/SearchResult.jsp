<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="css/Theme.css" rel="stylesheet" type="text/css"/>
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
    <script language="JavaScript" src="js/jquery-2.2.4.min.js"></script>
    <script language="JavaScript" src="js/bootstrap.min.js"></script>
    <script language="JavaScript" src="js/HomePage.js"></script>
    <title>找到图书</title>
</head>
<body>
<jsp:include page="/WEB-INF/content/Head.jsp">
    <jsp:param name="pageTitle" value="library"/>
</jsp:include>
<div class="container">
    <div class="row">
        <!--封面-->
        <% String image = "/images/火星救援.jpg"; %>
        <div class="col-md-2" >
            <img src="<%=image%>" width="110%" height="40%" style="margin-top: 50px"/><br>
            <img src="/images/现代马学.jpg" width="110%" height="40%" style="margin-top: 50px"/><br>
        </div>
        <!--书籍信息输出-->
        <div class="col-md-5">
            <div style="margin-left: 20px;margin-top: 55px">
                <p style="font-size: 22px">火星救援</p>
                <p style="font-size: 15px">
                    作者：安迪.威尔<br>
                    简介：好莱坞年度大片《火星救援》原著小说，《纽约时报》畅销书之作。
                </p>
                <input class="btn btn-primary" type="submit" value="  借阅本书  "onclick="BorrowSucc()"  style="margin-top: 90px"/>
            </div>
            <div style="margin-left: 20px;margin-top: 55px">
                <p style="font-size: 22px;margin-top: 50px">现代马学</p>
                <p style="font-size: 15px">
                    作者：侯文通<br>
                    简介：本书为我国近数十年，马、驴学科最为全面、系统的著作之一。
                </p>
                <input class="btn btn-primary" type="submit" value="  借阅本书  " style="margin-top: 90px" onclick="BorrowSucc()"/>
            </div>
        </div>
        <div class="col-md-2">
            <div class="Recommend" style="overflow: auto;overflow-x: hidden">
                <h5 align="left">你也许还想借这些书</h5>
                <div style="width: auto;height: 110px;margin-top: 40px">
                    <a href="#">
                        <img src="/images/火星救援.jpg" style="margin-left: 25%;margin-top: 5%;display: block" width="40%" height="100%"/>
                        <p style="margin-left: 25%;margin-top: 5%;width:40%" >作者：安迪.威尔</p>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

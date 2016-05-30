function Login(){
    var sHeight=document.documentElement.scrollHeight;
    var sWidth=document.documentElement.scrollWidth;
    var wHeight=document.documentElement.clientHeight;
    var oMask=document.createElement("div");
    oMask.id="mask";
    oMask.style.height=sHeight+"px";
    oMask.style.width=sWidth+"px";
    document.body.appendChild(oMask);
    var oLogin=document.createElement("div");
    oLogin.id="login";
    oLogin.innerHTML="<div class='loginCon'><br><br><br><br><form action='LoginAction' method='post' id='form1'><input type='text' class='logintext' name='username'><br><input type='password' class='logintext' name='password'><br><input type='hidden' id='hid' value='$tips'><br><input type='button' id='btnLogin1' value='µÇÂ¼'></form><div id='close'></div></div>";
    document.body.appendChild(oLogin);
    var dHeight=oLogin.offsetHeight;
    var dWidth=oLogin.offsetWidth;
    oLogin.style.top=(wHeight-dHeight)/2+"px";
    oLogin.style.left=(sWidth-dWidth)/2+"px";
    var oClose=document.getElementById("close");
    var oBtn1=document.getElementById("btnLogin1");
    oBtn1.onclick=function(username,password){
        var user=document.getElementsByClassName("logintext")[0].value;
        var pass=document.getElementsByClassName("logintext")[1].value;
        var tip=document.getElementById("hid").value;
        user.action=username;
        pass.action=password;
        var oForm=document.getElementById("form1");
        oForm.submit();
    }
    oMask.onclick=oClose.onclick=function(){
        document.body.removeChild(oMask);
        document.body.removeChild(oLogin);
    }

}
function Regist(){
    var sHeight=document.documentElement.scrollHeight;
    var sWidth=document.documentElement.scrollWidth;
    var wHeight=document.documentElement.clientHeight;
    var oMask=document.createElement("div");
    oMask.id="mask";
    oMask.style.height=sHeight+"px";
    oMask.style.width=sWidth+"px";
    document.body.appendChild(oMask);
    var oLogin=document.createElement("div");
    oLogin.id="login";
    oLogin.innerHTML="<div class='registCon'><br><br><br><br><form action='RegistAction' method='post' id='form1'><input type='text' class='logintext' name='username'><br><input type='password' class='logintext' name='password'><br><input type='button' id='btnLogin1' value='×¢²á'></form><div id='close'></div></div>";
    document.body.appendChild(oLogin);
    var dHeight=oLogin.offsetHeight;
    var dWidth=oLogin.offsetWidth;
    oLogin.style.top=(wHeight-dHeight)/2+"px";
    oLogin.style.left=(sWidth-dWidth)/2+"px";
    var oClose=document.getElementById("close");
    var oBtn1=document.getElementById("btnLogin1");
    oBtn1.onclick=function(username,password){
        var user=document.getElementsByClassName("logintext")[0].value;
        var pass=document.getElementsByClassName("logintext")[1].value;
        user.action=username;
        pass.action=password;
        var oForm=document.getElementById("form1");
        oForm.submit();

    }
    oMask.onclick=oClose.onclick=function(){
        document.body.removeChild(oMask);
        document.body.removeChild(oLogin);
    }

}
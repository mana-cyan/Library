function Login(){
    var sHeight=document.documentElement.scrollHeight;
    var sWidth=document.documentElement.scrollWidth;
    var oMask=document.createElement("div");
    oMask.id="mask";
    oMask.style.height=sHeight+"px";
    oMask.style.width=sWidth+"px";
    document.body.appendChild(oMask);
    var oLogin=document.createElement("div");
    oLogin.id="login";
    oLogin.innerHTML="<div class='loginCon'><br><br><br><br><form action='LoginAction' method='post' id='form1'><input type='text' class='usernameText' name='username'><br><input type='password' class='passwordText' name='password'><br><input type='hidden' id='hid' value='$tips'><br><input type='button' id='btnInnerLogin' class='innerButton' value='µÇÂ¼'></form><div id='close'></div></div>";
    document.body.appendChild(oLogin);
    var oClose=document.getElementById("close");
    var oBtn1=document.getElementById("btnInnerLogin");
    oBtn1.onclick=function(username,password){
        var user=document.getElementsByClassName("usernameText")[0].value;
        var pass=document.getElementsByClassName("passwordText")[0].value;
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
function Register(){
    var sHeight=document.documentElement.scrollHeight;
    var sWidth=document.documentElement.scrollWidth;
    var oMask=document.createElement("div");
    oMask.id="mask";
    oMask.style.height=sHeight+"px";
    oMask.style.width=sWidth+"px";
    document.body.appendChild(oMask);
    var oRegister=document.createElement("div");
    oRegister.id="login";
    oRegister.innerHTML="<div class='registerCon'><br><br><br><br><form action='RegisterAction' method='post' id='form1'><input type='text' class='usernameText' name='username'><br><input type='text' class='passwordText' name='password'><br><input type='button' id='btnInnerRegister' class='innerButton' value='×¢²á'></form><div id='close'></div></div>";
    document.body.appendChild(oRegister);
    var oClose=document.getElementById("close");
    var oBtn1=document.getElementById("btnInnerRegister");
    oBtn1.onclick=function(username,password){
        var user=document.getElementsByClassName("usernameText")[0].value;
        var pass=document.getElementsByClassName("passwordText")[0].value;
        user.action=username;
        pass.action=password;
        var oForm=document.getElementById("form1");
        oForm.submit();

    }
    oMask.onclick=oClose.onclick=function(){
        document.body.removeChild(oMask);
        document.body.removeChild(oRegister);
    }

}
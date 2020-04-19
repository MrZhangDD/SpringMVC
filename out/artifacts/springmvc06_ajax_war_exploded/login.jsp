<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020年04月19日 0019
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
        function a1(){
            $.get({
                url:"${pageContext.request.contextPath}/ajax4",
                data:{"name":$("#name").val()},
                success:function (data) {
                    console.log(data);
                    if(data.toString() === 'ok'){
                        $("#userInfo").css("color","green");
                    } else {
                        $("#userInfo").css("color","red");
                    }
                    $("#userInfo").html(data);
                }
            })
        }
        function a2(){
            $.post({
                url:"${pageContext.request.contextPath}/ajax4",
                data:{"pwd":$("#password").val()},
                success:function (data) {
                    console.log(data);
                    if(data.toString() === 'ok'){
                        $("#pwdInfo").css("color","green");
                    } else {
                        $("#pwdInfo").css("color","red");
                    }
                    $("#pwdInfo").html(data);
                }
            })
        }
    </script>

</head>
<body>
<p>
    用户名：<input type="text" id="name" onblur="a1()">
    <span id="userInfo"></span>
</p>
<p>
    密码：<input type="text" id="password" onblur="a2()">
    <span id="pwdInfo"></span>
</p>
</body>
</html>

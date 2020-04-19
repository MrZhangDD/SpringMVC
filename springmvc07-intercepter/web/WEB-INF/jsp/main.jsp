<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020年04月19日 0019
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <h1>首页</h1>
    <p>${user}</p>

    <a href="${pageContext.request.contextPath}/user/loginOut">注销</a>
</body>
</html>

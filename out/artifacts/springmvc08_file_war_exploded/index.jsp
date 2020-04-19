<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020年04月19日 0019
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit">
  </form>

  <a href="/download">点击下载</a>
  </body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表---修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form  action="${pageContext.request.contextPath}/book/updateBook" method="post">

<%--        传递隐藏域--%>
        <input type="hidden" name = "bookId" value="${QBook.bookId}">
        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" class="form-control" name="bookName" value="${QBook.bookName}" required>
        </div>
        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" class="form-control" name="bookCounts" value="${QBook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label>书籍描述</label>
            <input type="text" class="form-control" name="detail" value="${QBook.detail}" required>
        </div>
        <button type="submit" class="btn btn-default">提交入库</button>
    </form>
</div>
</body>
</html>

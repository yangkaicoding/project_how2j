<%--
  Created by IntelliJ IDEA.
  User: YangKai
  Date: 2019/10/9
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="margin: 0px auto; width: 500px">
    <form action="updateCategory" method="post">
        name:<input name="name" value="${category.name}"><br>
        <input name="id" type="hidden" value="${category.id}">
        <button type="submit">提交</button>
    </form>
</div>

</body>
</html>

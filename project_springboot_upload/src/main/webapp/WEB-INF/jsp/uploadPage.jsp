<%--
  Created by IntelliJ IDEA.
  User: YangKai
  Date: 2019/10/15
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%-- method="post"是必须的 --%>
<%-- enctype="multipart/form-data" 是必须的，表示提交二进制文件 --%>
<%-- name="file" 是必须的，和后续服务端对应 --%>
<%-- ccept="image/*" 表示只选择图片 --%>
<form action="upload" method="post" enctype="multipart/form-data">
    选择图片:<input type="file" name="file" accept="image/*"/><br>
    <input type="submit" value="上传">
</form>

</body>
</html>

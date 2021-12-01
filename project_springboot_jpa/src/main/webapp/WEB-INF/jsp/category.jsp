<%--
  Created by IntelliJ IDEA.
  User: YangKai
  Date: 2019/9/29
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <table align="center" border="1" cellspacing="0">
            <tr>
                <td>id</td>
                <td>name</td>
            </tr>
            <%--循环遍历--%>
            <c:forEach items="${categories}" var="c" varStatus="st">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.name}</td>
                </tr>
            </c:forEach>
        </table>

</body>
</html>

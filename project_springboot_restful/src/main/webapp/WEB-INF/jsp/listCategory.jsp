<%--
  Created by IntelliJ IDEA.
  User: YangKai
  Date: 2019/10/8
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript">
    // 将post method 改变为delete
    $(function () {
        $(".delete").click(function () {
            var href = $(this).attr("href");
            $("#formDelete").attr("action", href).submit()
            return false;
        })
    })
</script>
<div align="center">

</div>

<div style="width: 500px; margin: 20px auto; text-align: center ">
    <table align="center" border="1" cellspacing="0">
        <tr>
            <td>id</td>
            <td>name</td>
            <td>编辑</td>
            <td>删除</td>
        </tr>
        <c:forEach items="${page.content}" var="c" varStatus="st">
            <tr>
                <td>${c.id}</td>
                <td>${c.name}</td>
                <td><a href="categories/${c.id}">编辑</a></td>
                <td><a class="delete" href="categories/${c.id}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <div>
        <a href="?start=0">[首页]</a>
        <a href="?start=${page.number-1}">上一页</a>
        <a href="?start=${page.number+1}">下一页</a>
        <a href="?start=${page.totalPages-1}">末页</a>
    </div>
    <br>
    <form action="categories" method="post">
        name:<input name="name"><br>
        <button type="submit">提交</button>
    </form>

    <form id="formDelete" action="" method="POST">
        <input type="hidden" name="_method" value="DELETE">
    </form>
</div>

</body>
</html>

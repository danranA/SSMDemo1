<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>

<div>
    <p style="color:red;">
        添加商品的界面：
    </p>
</div>


<body>

<form action="${pageContext.request.contextPath }/action/dept/addDepts.do" method="post">
    <table class="table table-hover table-condensed">
        <thead>
        <tr>
            <th>编号</th>
            <th>名称</th>
            <th>地址</th>
            <th>口号</th>
            <th>预算</th>
        </tr>
        </thead>

        <tbody>
        <tr>
            <c:forEach items="${depts}" var="dept" varStatus="vs">
            <td><input class="checkbox" type="checkbox" name="chkId" value="${dept.deptno}"></td>
            <td>${dept.deptno}</td>
            <td>${dept.dname} </td>
            <td>${dept.loc}</td>
            <td>${dept.kouhao}</td>
            <td>${dept.yusuan}</td>
        </c:forEach>

            <td><input type="text" name="deptno"></td>
            <td><input type="text" name="dname" ></td>
            <td><input type="text" name="loc" ></td>
            <td><input type="text" name="kouhao"></td>
            <td><input type="text" name="yusuan"></td>

        </tr>
        </tbody>
    </table>

    <p style="color:red;">
        <input type="submit" value="点击确认添加一条">
    </p>

</form>
</body>

</html>

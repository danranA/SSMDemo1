<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
查找用户界面
<br>
<form action="${pageContext.request.contextPath }/action/user/findUsers.do" method="post">
    <p style="color:red;">
        <input type="submit" value="查找所有的用户 " >
    </p>
</form>
<form action="${pageContext.request.contextPath}/action/dept/findUsersBy.do" method="post">
    <div class="input-group">
        <input type="text" class="form-control" name="id">
        <div class="input-group-btn">
            <input type="submit" class="btn btn-default" value="根据编号查找">
        </div>
    </div>
</form>
<table class="table table-hover table-condensed">
    <thead>
    <tr>
        <th></th>
        <th>编号</th>
        <th>姓名</th>
        <th>密码</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user" varStatus="vs">
        <tr>
            <td><input class="checkbox" type="checkbox" name="chkId1" value="${user.id}"></td>
            <td>${user.id}</td>
            <td>${user.name} </td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

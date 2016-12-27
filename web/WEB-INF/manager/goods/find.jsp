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
查找商品界面
<br>
<form action="${pageContext.request.contextPath }/action/dept/findDepts.do" method="post">
    <p style="color:red;">
        <input type="submit" value="查找所有的商品 " >
</p>

</form>


<form action="${pageContext.request.contextPath}/action/dept/findDeptsBy.do" method="post">
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
        <th>名称</th>
        <th>地址</th>
        <th>口号</th>
        <th>预算</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${depts}" var="dept" varStatus="vs">
        <tr>
            <td><input class="checkbox" type="checkbox" name="chkId" value="${dept.deptno}"></td>
            <td>${dept.deptno}</td>
            <td>${dept.dname} </td>
            <td>${dept.loc}</td>
            <td>${dept.kouhao}</td>
            <td>${dept.yusuan}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
${dept}
</body>
</html>

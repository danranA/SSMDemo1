
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <p style="color:red;">
        请输入要删除商品的编号：
    </p>
</div>

<form action="${pageContext.request.contextPath }/action/dept/deleteDept.do" method="post">
    <input type="text" name="id">

    <p style="color:red;">
        <input type="submit" value="删除一条商品">
    </p>

</form>
</body>
</html>

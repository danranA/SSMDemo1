<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="pagging">
    <div class="left">共${userNum}条记录</div>
    <div class="right">
        <c:if test="${currentPage == 1}">
            <span class="disabled"><< 前一页</span>
        </c:if>
        <c:if test="${currentPage != 1}">
            <a href="listUser.do?page=${currentPage-1}"><< 前一页</a>
        </c:if>
        <c:if test="${currentPage == 1}">
            <span class="current">1</span>
        </c:if>
        <c:if test="${currentPage != 1}">
            <a href="listUser.do?page=1">1</a>
        </c:if>
        <%
            int pageTimes = (Integer)session.getAttribute("pageTimes");
            for(int i=1;i<pageTimes;i++)
            {
                request.setAttribute("page", i+1);
        %>
        <c:if test="${currentPage == page}">
            <span class="current"><%=i+1%></span>
        </c:if>
        <c:if test="${currentPage != page}">
            <a href="listUser.do?page=<%=i+1%>"><%=i+1%></a>
        </c:if>
        <%} %>

        <c:if test="${currentPage == pageTimes}">
            <span class="disabled">后一页 >></span>
        </c:if>
        <c:if test="${currentPage != pageTimes}">
            <a href="listUser.do?page=${currentPage+1}">后一页 >></a>
        </c:if>
    </div>
</div>
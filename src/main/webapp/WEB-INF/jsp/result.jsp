<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<html>
<head>
</head>
<body>
<h1>欢迎登录简历系统！</h1><br/>
    <h2>我是服务器：${pageContext.request.localPort}</h2>
    <h2>当前sessionId：${pageContext.session.id}</h2>

<h1>简历详情</h1>
<table>
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>地址</td>
        <td>手机号</td>
    </tr>
    <c:if test="${not empty resumeList}">
        <c:forEach items="${resumeList}" var="resume">
            <tr>
                <td align = "center">${resume.id}</td>
                <td align = "center">${resume.name}</td>
                <td align = "center">${resume.address}</td>
                <td align = "center">${resume.phone}</td>
            </tr>
        </c:forEach>
    </c:if>

</table>


</body>
</html>

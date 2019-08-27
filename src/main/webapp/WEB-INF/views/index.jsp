<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path_top = request.getContextPath();
    String basePath_top = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path_top + "/";
%>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${users}" var="s" >
        <tr>
            <td>${s.user_id}</td>
            <td><a  href="<%=basePath_top %>/getUserInf?user_id=${s.user_id}">详细分布</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
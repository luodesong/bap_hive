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
<div>
    美团客户下单时间分布表
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>日期</td>
            <td>下单人数</td>
            <td>单人详情表</td>
            <td>下单总数</td>
            <td>下单详情表</td>
        </tr>
        <c:forEach items="${times}" var="s" >
            <tr>
                <td>${s.stat_time}</td>
                <td>${s.user_num}</td>
                <td><a  href="<%=basePath_top %>/getAllUser?stat_time=${s.stat_time}">详细情况</a></td>
                <td>${s.order_num}</td>
                <td><a  href="<%=basePath_top %>/getOrderDayDis?stat_time=${s.stat_time}">详细情况</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</table>
</body>
</html>
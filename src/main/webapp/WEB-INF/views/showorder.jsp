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
<div id='main' style='width:1000px;height:400px;'></div>
<body>
<script type="text/javascript" src="<%=basePath_top %>/js/echarts.min.js"></script>
<script>
    //基于准备好的DOM，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
    //指定图表的配置项和数据
    var option = {
        title:{
            text:'${order.getStat_time()}号的订单',
            left: 'center'
        },
        //提示框组件
        tooltip:{
            //坐标轴触发，主要用于柱状图，折线图等
            trigger:'axis'
        },

        //横轴
        xAxis:{
            data:['学校订单','家庭订单','公司订单','凌晨订单','早晨订单','午后订单','下午订单','午夜订单']
        },
        //纵轴
        yAxis:{},
        //系列列表。每个系列通过type决定自己的图表类型
        series:[{
            name:'订单量',
            type:'bar',
            data:['${order.getSo()}','${order.getHo()}','${order.getCo()}','${order.getCzo()}','${order.getCso()}','${order.getHo()}','${order.getCtxo()}','${order.getCtto()}']
        }]
    };
    //使用刚指定的配置项和数据显示图表
    myChart.setOption(option);
</script>
</body>
</html>
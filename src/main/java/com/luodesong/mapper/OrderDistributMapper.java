package com.luodesong.mapper;


import com.luodesong.pojo.OrderDayDistribut;
import com.luodesong.pojo.OrderDistribut;
import com.luodesong.pojo.OrderDroo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @description
 * @author: LuoDeSong 694118297@qq.com
 * @create: 2019-07-18 11:03:52
 **/
@Repository
@Mapper
public interface OrderDistributMapper {

    @Select("SELECT \n" +
            "*\n" +
            "FROM `dm_order_distribute`\n" +
            "WHERE stat_time = '${data}'\n" +
            "limit 10;")
   List<OrderDistribut> getUsersByTime(@Param("data")String data);

    @Select("SELECT\n" +
           "*\n" +
           "FROM `dm_order_distribute`\n" +
           "WHERE user_id = ${id};")
   OrderDistribut getUsersById(@Param("id")int id);

    @Select("select\n" +
            "temps.stat_time,\n" +
            "temps.so + \n" +
            "temps.ho + \n" +
            "temps.co + \n" +
            "temps.czo +\n" +
            "temps.cso +\n" +
            "temps.cto +\n" +
            "temps.ctxo +\n" +
            "temps.ctto order_num,\n" +
            "temps2.user_num\n" +
            "from(\n" +
            "select \n" +
            "stat_time,\n" +
            "sum(school_orders) so,\n" +
            "sum(home_orders) ho,\n" +
            "sum(company_orders) co,\n" +
            "sum(cnt_0_5_orders) czo,\n" +
            "sum(cnt_6_12_orders) cso,\n" +
            "sum(cnt_13_15_orders) cto,\n" +
            "sum(cnt_16_20_orders) ctxo,\n" +
            "sum(cnt_21_23_orders) ctto\n" +
            "FROM dm_order_distribute\n" +
            "GROUP BY\n" +
            "stat_time\n" +
            ") as temps\n" +
            "join (\n" +
            "SELECT \n" +
            "stat_time, \n" +
            "SUM(user_id) user_num \n" +
            "FROM `dm_order_distribute` \n" +
            "GROUP BY stat_time\n" +
            ") as temps2\n" +
            "on temps.stat_time = temps2.stat_time;")
    List<OrderDroo> getAllOrderDroo();

    @Select("select \n" +
            "stat_time,\n" +
            "sum(school_orders) so,\n" +
            "sum(home_orders) ho,\n" +
            "sum(company_orders) co,\n" +
            "sum(cnt_0_5_orders) czo,\n" +
            "sum(cnt_6_12_orders) cso,\n" +
            "sum(cnt_13_15_orders) cto,\n" +
            "sum(cnt_16_20_orders) ctxo,\n" +
            "sum(cnt_21_23_orders) ctto\n" +
            "FROM dm_order_distribute\n" +
            "where stat_time = '${data}'\n" +
            "GROUP BY\n" +
            "stat_time")
    OrderDayDistribut getOrderDayDis(@Param("data")String time);
}

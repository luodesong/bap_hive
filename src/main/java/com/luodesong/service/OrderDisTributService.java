package com.luodesong.service;

import com.luodesong.pojo.OrderDayDistribut;
import com.luodesong.pojo.OrderDistribut;
import com.luodesong.pojo.OrderDroo;

import java.util.List;

public interface OrderDisTributService {
    List<OrderDistribut>getAllUsersByTime(String time);

    OrderDistribut getAllUsersById(int id);

    List<OrderDroo> getAllOrderDroo();

    OrderDayDistribut getOrderDayDis(String time);
}

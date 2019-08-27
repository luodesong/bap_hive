package com.luodesong.service.impl;

import com.luodesong.mapper.OrderDistributMapper;
import com.luodesong.pojo.OrderDayDistribut;
import com.luodesong.pojo.OrderDistribut;
import com.luodesong.pojo.OrderDroo;
import com.luodesong.service.OrderDisTributService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author: LuoDeSong 694118297@qq.com
 * @create: 2019-07-18 11:13:58
 **/
@Service("OrderDisTributService")
public class OrderDisTributServiceImpl implements OrderDisTributService {

    @Autowired
    public OrderDistributMapper orderDistributMapper;

    @Override
    public List<OrderDistribut> getAllUsersByTime(String time) {
        return orderDistributMapper.getUsersByTime(time);
    }

    @Override
    public OrderDistribut getAllUsersById(int id) {
        return orderDistributMapper.getUsersById(id);
    }

    @Override
    public List<OrderDroo> getAllOrderDroo() {
        return orderDistributMapper.getAllOrderDroo();
    }

    @Override
    public OrderDayDistribut getOrderDayDis(String time) {
        return orderDistributMapper.getOrderDayDis(time);
    }
}

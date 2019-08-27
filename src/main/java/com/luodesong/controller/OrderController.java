package com.luodesong.controller;

import com.luodesong.pojo.OrderDayDistribut;
import com.luodesong.service.OrderDisTributService;
import com.luodesong.util.ResMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @description
 * @author: LuoDeSong 694118297@qq.com
 * @create: 2019-07-19 11:13:17
 **/
@RestController()
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    public OrderDisTributService orderDisTributService;

    /*
    czo;
    cso;
    cto;
    ctxo;
    ctto;
    '凌晨订单','早晨订单','午后订单','晚上订单','午夜订单'
     */
    @RequestMapping(value = "/getOrderDayDis/{dt}",method = RequestMethod.GET)
    public ResMsg getOrderDayDis(@PathVariable("dt")String dt) {
        ResMsg resMsg;
        try {
            //String time = request.getParameter();
            OrderDayDistribut orderDayDis = orderDisTributService.getOrderDayDis(dt);
            ArrayList<Map<String, String>> ress = new ArrayList<>();
            HashMap<String, String> one = new HashMap<>();
            one.put("name","凌晨");
            one.put("value",String.valueOf(orderDayDis.getCzo()));
            ress.add(one);

            HashMap<String, String> tow = new HashMap<>();
            tow.put("name","早晨");
            tow.put("value",String.valueOf(orderDayDis.getCso()));
            ress.add(tow);

            HashMap<String, String> three = new HashMap<>();
            three.put("name","午后");
            three.put("value",String.valueOf(orderDayDis.getCto()));
            ress.add(three);

            HashMap<String, String> four = new HashMap<>();
            four.put("name","晚上");
            four.put("value",String.valueOf(orderDayDis.getCtxo()));
            ress.add(four);

            HashMap<String, String> five = new HashMap<>();
            five.put("name","午夜");
            five.put("value",String.valueOf(orderDayDis.getCtto()));
            ress.add(five);
            resMsg = ResMsg.success();
            resMsg.setData(ress);


        } catch (Exception e) {
            e.printStackTrace();
            resMsg = ResMsg.fail();
            resMsg.setData("[]");
        }
        return resMsg;
    }
}

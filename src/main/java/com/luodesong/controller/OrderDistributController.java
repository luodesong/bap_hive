package com.luodesong.controller;

import com.luodesong.pojo.OrderDayDistribut;
import com.luodesong.pojo.OrderDistribut;
import com.luodesong.pojo.OrderDroo;
import com.luodesong.service.OrderDisTributService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @description
 * @author: LuoDeSong 694118297@qq.com
 * @create: 2019-07-18 11:11:13
 **/
@Controller
@RequestMapping("/OrderDistributController")
public class OrderDistributController {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    public OrderDisTributService orderDisTributService;

    @RequestMapping("/getAllTime")
    public String getAllTime(Model model) {
        List<OrderDroo> orders = orderDisTributService.getAllOrderDroo();
        model.addAttribute("times", orders);
        return "door";
    }

    @RequestMapping("/getAllUser")
    public String getUser(Model model) {
        String time = request.getParameter("stat_time");
        List<OrderDistribut> allUsersByTime = orderDisTributService.getAllUsersByTime(time);
        model.addAttribute("users", allUsersByTime);
        return "index";
    }

    @RequestMapping("/getUserInf")
    public String getUserInf(Model model) {
        int id = Integer.parseInt(request.getParameter("user_id"));
        String time = request.getParameter("stat_time");
        OrderDistribut allUsersById = orderDisTributService.getAllUsersById(id);
        System.out.println(allUsersById.toString());
        model.addAttribute("user", allUsersById);
        return "show";
    }

    @RequestMapping("/getOrderDayDis")
    public String getOrderDayDis(Model model) {
        String time = request.getParameter("stat_time");
        OrderDayDistribut orderDayDis = orderDisTributService.getOrderDayDis(time);
        model.addAttribute("order", orderDayDis);
        return "showorder";
    }
}

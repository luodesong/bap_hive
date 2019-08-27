package com.luodesong.pojo;

import java.util.Objects;

/**
 * @description
 * @author: LuoDeSong 694118297@qq.com
 * @create: 2019-07-18 12:58:52
 **/
public class OrderDroo {
    private String stat_time;
    private int user_num;
    private int order_num;

    public OrderDroo() {
        super();
    }

    public OrderDroo(String stat_time, int user_num, int order_num) {
        this.stat_time = stat_time;
        this.user_num = user_num;
        this.order_num = order_num;
    }

    public String getStat_time() {
        return stat_time;
    }

    public void setStat_time(String stat_time) {
        this.stat_time = stat_time;
    }

    public int getUser_num() {
        return user_num;
    }

    public void setUser_num(int user_num) {
        this.user_num = user_num;
    }

    public int getOrder_num() {
        return order_num;
    }

    public void setOrder_num(int order_num) {
        this.order_num = order_num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDroo orderDroo = (OrderDroo) o;
        return user_num == orderDroo.user_num &&
                order_num == orderDroo.order_num &&
                Objects.equals(stat_time, orderDroo.stat_time);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stat_time, user_num, order_num);
    }

    @Override
    public String toString() {
        return "OrderDroo{" +
                "stat_time='" + stat_time + '\'' +
                ", user_num=" + user_num +
                ", order_num=" + order_num +
                '}';
    }
}

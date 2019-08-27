package com.luodesong.pojo;

import java.util.Objects;

/**
 * @description
 * @author: LuoDeSong 694118297@qq.com
 * @create: 2019-07-18 10:57:43
 **/
public class OrderDistribut {
    private int user_id;
    private int school_orders;
    private int home_orders;
    private int company_orders;
    private int cnt_0_5_orders;
    private int cnt_6_12_orders;
    private int cnt_13_15_orders;
    private int cnt_16_20_orders;
    private int cnt_21_23_orders;
    private String stat_time;

    public OrderDistribut() {
        super();
    }

    public OrderDistribut(int user_id, int school_orders, int home_orders, int company_orders, int cnt_0_5_orders, int cnt_6_12_orders, int cnt_13_15_orders, int cnt_16_20_orders, int cnt_21_23_orders, String stat_time) {
        this.user_id = user_id;
        this.school_orders = school_orders;
        this.home_orders = home_orders;
        this.company_orders = company_orders;
        this.cnt_0_5_orders = cnt_0_5_orders;
        this.cnt_6_12_orders = cnt_6_12_orders;
        this.cnt_13_15_orders = cnt_13_15_orders;
        this.cnt_16_20_orders = cnt_16_20_orders;
        this.cnt_21_23_orders = cnt_21_23_orders;
        this.stat_time = stat_time;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSchool_orders() {
        return school_orders;
    }

    public void setSchool_orders(int school_orders) {
        this.school_orders = school_orders;
    }

    public int getHome_orders() {
        return home_orders;
    }

    public void setHome_orders(int home_orders) {
        this.home_orders = home_orders;
    }

    public int getCompany_orders() {
        return company_orders;
    }

    public void setCompany_orders(int company_orders) {
        this.company_orders = company_orders;
    }

    public int getCnt_0_5_orders() {
        return cnt_0_5_orders;
    }

    public void setCnt_0_5_orders(int cnt_0_5_orders) {
        this.cnt_0_5_orders = cnt_0_5_orders;
    }

    public int getCnt_6_12_orders() {
        return cnt_6_12_orders;
    }

    public void setCnt_6_12_orders(int cnt_6_12_orders) {
        this.cnt_6_12_orders = cnt_6_12_orders;
    }

    public int getCnt_13_15_orders() {
        return cnt_13_15_orders;
    }

    public void setCnt_13_15_orders(int cnt_13_15_orders) {
        this.cnt_13_15_orders = cnt_13_15_orders;
    }

    public int getCnt_16_20_orders() {
        return cnt_16_20_orders;
    }

    public void setCnt_16_20_orders(int cnt_16_20_orders) {
        this.cnt_16_20_orders = cnt_16_20_orders;
    }

    public int getCnt_21_23_orders() {
        return cnt_21_23_orders;
    }

    public void setCnt_21_23_orders(int cnt_21_23_orders) {
        this.cnt_21_23_orders = cnt_21_23_orders;
    }

    public String getStat_time() {
        return stat_time;
    }

    public void setStat_time(String stat_time) {
        this.stat_time = stat_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDistribut that = (OrderDistribut) o;
        return user_id == that.user_id &&
                school_orders == that.school_orders &&
                home_orders == that.home_orders &&
                company_orders == that.company_orders &&
                cnt_0_5_orders == that.cnt_0_5_orders &&
                cnt_6_12_orders == that.cnt_6_12_orders &&
                cnt_13_15_orders == that.cnt_13_15_orders &&
                cnt_16_20_orders == that.cnt_16_20_orders &&
                cnt_21_23_orders == that.cnt_21_23_orders &&
                Objects.equals(stat_time, that.stat_time);
    }

    @Override
    public int hashCode() {

        return Objects.hash(user_id, school_orders, home_orders, company_orders, cnt_0_5_orders, cnt_6_12_orders, cnt_13_15_orders, cnt_16_20_orders, cnt_21_23_orders, stat_time);
    }
}

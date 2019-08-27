package com.luodesong.pojo;

import java.util.Objects;

/**
 * @description
 * @author: LuoDeSong 694118297@qq.com
 * @create: 2019-07-18 14:39:41
 **/
public class OrderDayDistribut {
    private String stat_time;
    private int so;
    private int ho;
    private int co;
    private int czo;
    private int cso;
    private int cto;
    private int ctxo;
    private int ctto;

    public OrderDayDistribut() {
        super();
    }

    public OrderDayDistribut(String stat_time, int so, int ho, int co, int czo, int cso, int cto, int ctxo, int ctto) {
        this.stat_time = stat_time;
        this.so = so;
        this.ho = ho;
        this.co = co;
        this.czo = czo;
        this.cso = cso;
        this.cto = cto;
        this.ctxo = ctxo;
        this.ctto = ctto;
    }

    public String getStat_time() {
        return stat_time;
    }

    public void setStat_time(String stat_time) {
        this.stat_time = stat_time;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public int getHo() {
        return ho;
    }

    public void setHo(int ho) {
        this.ho = ho;
    }

    public int getCo() {
        return co;
    }

    public void setCo(int co) {
        this.co = co;
    }

    public int getCzo() {
        return czo;
    }

    public void setCzo(int czo) {
        this.czo = czo;
    }

    public int getCso() {
        return cso;
    }

    public void setCso(int cso) {
        this.cso = cso;
    }

    public int getCto() {
        return cto;
    }

    public void setCto(int cto) {
        this.cto = cto;
    }

    public int getCtxo() {
        return ctxo;
    }

    public void setCtxo(int ctxo) {
        this.ctxo = ctxo;
    }

    public int getCtto() {
        return ctto;
    }

    public void setCtto(int ctto) {
        this.ctto = ctto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDayDistribut that = (OrderDayDistribut) o;
        return so == that.so &&
                ho == that.ho &&
                co == that.co &&
                czo == that.czo &&
                cso == that.cso &&
                cto == that.cto &&
                ctxo == that.ctxo &&
                ctto == that.ctto &&
                Objects.equals(stat_time, that.stat_time);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stat_time, so, ho, co, czo, cso, cto, ctxo, ctto);
    }

    @Override
    public String toString() {
        return "OrderDayDistribut{" +
                "stat_time='" + stat_time + '\'' +
                ", so=" + so +
                ", ho=" + ho +
                ", co=" + co +
                ", czo=" + czo +
                ", cso=" + cso +
                ", cto=" + cto +
                ", ctxo=" + ctxo +
                ", ctto=" + ctto +
                '}';
    }
}

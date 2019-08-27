package com.luodesong.util;

/**
 *
 */
public class ResMsg {

    private int code; //返回状态码

    private String msg;//返回状态信息

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    //成功信息
    public static ResMsg success() {
        ResMsg msg = new ResMsg();
        msg.setCode(200);
        msg.setMsg("处理成功!");
        return msg;
    }

    //失败信息
    public static ResMsg fail() {
        ResMsg msg = new ResMsg();
        msg.setCode(400);
        msg.setMsg("处理失败!");
        return msg;
    }

    //包含的数据
    private Object data = null;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
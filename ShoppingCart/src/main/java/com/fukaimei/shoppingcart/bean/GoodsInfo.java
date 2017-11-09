package com.fukaimei.shoppingcart.bean;

public class GoodsInfo {
    public long rowid;
    public int xuhao;
    public String name;
    public String desc;
    public double price;
    public String thumb_path;
    public String pic_path;

    public GoodsInfo() {
        rowid = 0l;
        xuhao = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
    }
}

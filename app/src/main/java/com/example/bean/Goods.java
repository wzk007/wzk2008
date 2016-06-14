package com.example.bean;

/**
 * Created by francis on 2016/6/13.
 */
public class Goods {
    private String name;
    private String info;
    private double price;
    private int id;

    public Goods(String name, String info, double price, int id) {
        this.name = name;
        this.info = info;
        this.price = price;
        this.id = id;
    }

    public Goods() {
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

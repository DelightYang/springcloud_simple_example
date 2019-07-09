package com.learnspring.springcloud.pojo;

public class NikeUser {
    private int id;
    private String name;

    public NikeUser() {
    }

    public NikeUser(int id) {
        this.id = id;
//        这里是直接指定了一个用户名
        this.name = "Admin";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

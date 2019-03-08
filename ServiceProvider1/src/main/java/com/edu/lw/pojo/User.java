package com.edu.lw.pojo;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description
 * @Author lw
 * @Date 2019/3/7 0007
 * @Version V1.0.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = -6043836620314163321L;

    private int id;
    private String name;
    private String pass;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name='" + name + '\'' + ", pass='" + pass + '\'' + '}';
    }

    public User(int id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}

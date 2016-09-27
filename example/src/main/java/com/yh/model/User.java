package com.yh.model;

/**
 * Created by Administrator on 2016/9/27.
 */
class User {
    private Long id;

    private String username;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("hh");
        System.out.println("hh");

        int i = 2;
        int t = 6;

        int sum = i + t;

        System.out.println(sum);

        System.out.println("hh");
        System.out.println("hh");
        System.out.println("hh");
    }
}

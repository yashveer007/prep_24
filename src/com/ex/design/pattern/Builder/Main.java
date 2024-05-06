package com.ex.design.pattern.Builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId(1234)
                .setUserName("yashveer")
                .setAddress("Amroha")
                .build();
        System.out.println(user);
    }
}

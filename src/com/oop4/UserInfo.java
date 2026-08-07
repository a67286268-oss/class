package com.oop4;

public class UserInfo {

    String userId;
    String userPassword;
    String userName;
    String userAddress;
    String phoneNumber;

    public UserInfo(String id,String name,String add, String ph) {
        userName = name;
        userId = id;
        userAddress = add;
        phoneNumber = ph;
    }

    public UserInfo(String u, String password) {
        userId = u;
        userPassword = password;
    }


}

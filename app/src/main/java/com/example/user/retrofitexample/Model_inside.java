package com.example.user.retrofitexample;

import com.google.gson.annotations.SerializedName;

public class Model_inside {
// key values in json object
    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @SerializedName("UserId") // json key
    private long UserId;

    @SerializedName("Name") // json key
    private String name;

    @SerializedName("Username") // json key
    private String Username;

    @SerializedName("Password") // json key
    private String Password;
}

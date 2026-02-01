package com.estrada.mvvm;

public class UserItem {
    int image;
    String name;
    String status;

    public UserItem(int image, String name, String status) {
        this.image = image;
        this.name = name;
        this.status = status;
    }

    public int getImage() { return image; }
    public String getName() { return name; }
    public String getStatus() { return status; }
}
package com.praktikum.users;

import com.praktikum.data.Item;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class User { // SUPERCLASS
    private String username, uniqueCode; // Encapsulation attribute
    public int pilihan=0;
    Scanner myScanner = new Scanner(System.in);

    ArrayList<User> userArrayList;
    ArrayList<Item> itemArrayList;
    public boolean hasLogged;

    public User(String username, String uniqueCode) {
        this.username = username;
        this.uniqueCode = uniqueCode;
    } // constructor class User

    public String getUsername() {
        return username;
    } // getting username

    public void setUsername(String inputUsername) {
        username = inputUsername;
    } // set username

    public String getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(String inputNIM) {
        uniqueCode = inputNIM;
    }

    public void setItemArrayList(ArrayList<Item> items){
        this.itemArrayList = items;
    }
    public void setUserArrayList(ArrayList<User> users){
        this.userArrayList = users;
    }
    public abstract void login();
    public abstract void displayInfo();
    public abstract void displayAppMenu();

}
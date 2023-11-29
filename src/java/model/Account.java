/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author _DELL_
 */
public class Account {
    private int user_id;
    private String username;
    private String password;
    private int isUser;
    private int isAdmin;

    public Account() {
    }

    public Account(int user_id, String username, String password, int isUser, int isAdmin) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.isUser = isUser;
        this.isAdmin = isAdmin;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIsUser() {
        return isUser;
    }

    public void setIsUser(int isUser) {
        this.isUser = isUser;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Account{" + "user_id=" + user_id + ", username=" + username + ", password=" + password + ", isUser=" + isUser + ", isAdmin=" + isAdmin + '}';
    }
    
}

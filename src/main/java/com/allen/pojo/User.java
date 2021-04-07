package com.allen.pojo;

/**
 * @author ifree
 */

public class User {
    private int userID;
    private String userName;
    private String userAccount;
    private String userPassword;
    private String sex;
    private int authority;

    public User() {
    }

    public User(int userID, String userName, String userAccount, String userPassword, String sex, int authority) {
        this.userID = userID;
        this.userName = userName;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.sex = sex;
        this.authority = authority;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", sex='" + sex + '\'' +
                ", authority=" + authority +
                '}';
    }
}

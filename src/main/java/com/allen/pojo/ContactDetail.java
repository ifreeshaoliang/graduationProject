package com.allen.pojo;


/**
 * @author ifree
 */
public class ContactDetail {
    private int contactID;
    private int userID;
    private String address;
    private String phone;

    public ContactDetail() {
    }

    public ContactDetail(int contactID, int userID, String address, String phone) {
        this.contactID = contactID;
        this.userID = userID;
        this.address = address;
        this.phone = phone;
    }

    public int getContactID() {
        return contactID;
    }

    public void setContactID(int contactID) {
        this.contactID = contactID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ContactDetail{" +
                "contactID=" + contactID +
                ", userID=" + userID +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

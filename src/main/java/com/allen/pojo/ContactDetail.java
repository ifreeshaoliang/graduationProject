package com.allen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ifree
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDetail {
    private int contactID;
    private int userID;
    private String address;
    private String phone;
}

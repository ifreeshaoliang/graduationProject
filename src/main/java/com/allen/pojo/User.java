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
public class User {
    private int userID;
    private String userName;
    private String userAccount;
    private String userPassword;
    private String sex;
    private int authority;
}

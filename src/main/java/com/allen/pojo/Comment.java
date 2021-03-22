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
public class Comment {
    private int commentID;
    private int commentUserID;
    private String commentContext;
}

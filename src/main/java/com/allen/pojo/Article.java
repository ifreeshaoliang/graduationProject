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
public class Article {
    private int articleID;
    private int userID;
    private String articleTitle;
    private String articleContext;
}

package com.allen.pojo;


/**
 * @author ifree
 */

public class Article {
    private int articleID;
    private int userID;
    private String articleTitle;
    private String articleDescription;
    private String articleContext;

    public Article() {
    }

    public Article(int articleID, int userID, String articleTitle, String articleDescription, String articleContext) {
        this.articleID = articleID;
        this.userID = userID;
        this.articleTitle = articleTitle;
        this.articleDescription = articleDescription;
        this.articleContext = articleContext;
    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleDescription() {
        return articleDescription;
    }

    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public String getArticleContext() {
        return articleContext;
    }

    public void setArticleContext(String articleContext) {
        this.articleContext = articleContext;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleID=" + articleID +
                ", userID=" + userID +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleDescription='" + articleDescription + '\'' +
                ", articleContext='" + articleContext + '\'' +
                '}';
    }
}

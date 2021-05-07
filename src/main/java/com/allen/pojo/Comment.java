package com.allen.pojo;

/**
 * @author ifree
 */

public class Comment {
    private int commentID;
    private int articleID;
    private int commentUserID;
    private int commentToUserID;
    private String commentContext;

    public Comment() {
    }

    public Comment(int commentID, int articleID, int commentUserID, int commentToUserID, String commentContext) {
        this.commentID = commentID;
        this.articleID = articleID;
        this.commentUserID = commentUserID;
        this.commentToUserID = commentToUserID;
        this.commentContext = commentContext;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public int getCommentUserID() {
        return commentUserID;
    }

    public void setCommentUserID(int commentUserID) {
        this.commentUserID = commentUserID;
    }

    public int getCommentToUserID() {
        return commentToUserID;
    }

    public void setCommentToUserID(int commentToUserID) {
        this.commentToUserID = commentToUserID;
    }

    public String getCommentContext() {
        return commentContext;
    }

    public void setCommentContext(String commentContext) {
        this.commentContext = commentContext;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", articleID=" + articleID +
                ", commentUserID=" + commentUserID +
                ", commentToUserID=" + commentToUserID +
                ", commentContext='" + commentContext + '\'' +
                '}';
    }
}

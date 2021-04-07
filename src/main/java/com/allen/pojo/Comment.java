package com.allen.pojo;

/**
 * @author ifree
 */

public class Comment {
    private int commentID;
    private int commentUserID;
    private String commentContext;

    public Comment() {
    }

    public Comment(int commentID, int commentUserID, String commentContext) {
        this.commentID = commentID;
        this.commentUserID = commentUserID;
        this.commentContext = commentContext;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public int getCommentUserID() {
        return commentUserID;
    }

    public void setCommentUserID(int commentUserID) {
        this.commentUserID = commentUserID;
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
                ", commentUserID=" + commentUserID +
                ", commentContext='" + commentContext + '\'' +
                '}';
    }
}

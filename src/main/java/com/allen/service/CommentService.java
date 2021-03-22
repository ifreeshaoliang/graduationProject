package com.allen.service;

import com.allen.pojo.Comment;

import java.util.List;

public interface CommentService {
    int addComment(Comment comment);

    int deleteComment(int id);

    int updateComment(Comment comment);

    Comment queryCommentByID(int id);

    List<Comment> queryAllComment();
}

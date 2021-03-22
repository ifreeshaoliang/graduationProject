package com.allen.service.Impl;

import com.allen.dao.CommentMapper;
import com.allen.pojo.Comment;
import com.allen.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ifree
 */
@Service
public class CommentServiceImpl implements CommentService {
    private CommentMapper commentMapper;

    @Autowired
    @Qualifier("commentMapper")
    public void setCommentMapper(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

    @Override
    public int addComment(Comment comment) {
        return commentMapper.addComment(comment);
    }

    @Override
    public int deleteComment(int id) {
        return commentMapper.deleteComment(id);
    }

    @Override
    public int updateComment(Comment comment) {
        return commentMapper.updateComment(comment);
    }

    @Override
    public Comment queryCommentByID(int id) {
        return commentMapper.queryCommentByID(id);
    }

    @Override
    public List<Comment> queryAllComment() {
        return commentMapper.queryAllComment();
    }
}

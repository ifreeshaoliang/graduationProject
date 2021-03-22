package com.allen.dao;

import com.allen.pojo.Comment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Insert("insert into comment(commentUserID, ) " +
            "values (#{commentUserID}, #{commentContext})")
    int addComment(Comment comment);

    @Delete("delete from comment where commentID = #{commentID}")
    int deleteComment(int id);

    @Update("update comment " +
            "set commentUserID=#{commentUserID}, commentContext=#{commentContext} " +
            "where commentID = #{commentID}")
    int updateComment(Comment comment);

    @Select("select * from comment where commentID = #{commentID}")
    Comment queryCommentByID(int id);

    @Select("select * from comment")
    List<Comment> queryAllComment();
}

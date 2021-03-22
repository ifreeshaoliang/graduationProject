package com.allen.dao;

import com.allen.pojo.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
    @Insert("insert into article(userID, articleTitle, articleContext)" +
            "values (#{userID}, #{articleTitle}, #{articleContext}) ")
    int addArticle(Article article);

    @Delete("delete from article where articleID = #{articleID}")
    int deleteArticle(int id);

    @Update("update article" +
            "set userID=#{userID}, articleTitle=#{articleTitle}, articleContext=#{articleContext} " +
            "where articleID = #{articleID}")
    int updateArticle(Article article);

    @Select("select * from article where articleID = #{articleID}")
    Article queryArticleByID(int id);

    @Select("select * from article")
    List<Article> queryAllArticle();
}

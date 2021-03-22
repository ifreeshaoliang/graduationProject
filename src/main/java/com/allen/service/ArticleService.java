package com.allen.service;

import com.allen.pojo.Article;


import java.util.List;

public interface ArticleService {
    int addArticle(Article article);

    int deleteArticle(int id);

    int updateArticle(Article article);

    Article queryArticleByID(int id);

    List<Article> queryAllArticle();
}

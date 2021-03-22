package com.allen.service.Impl;

import com.allen.dao.ArticleMapper;
import com.allen.pojo.Article;
import com.allen.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ifree
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private ArticleMapper articleMapper;

    @Autowired
    @Qualifier("articleMapper")
    public void setArticleMapper(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    @Override
    public int addArticle(Article article) {
        return articleMapper.addArticle(article);
    }

    @Override
    public int deleteArticle(int id) {
        return articleMapper.deleteArticle(id);
    }

    @Override
    public int updateArticle(Article article) {
        return articleMapper.updateArticle(article);
    }

    @Override
    public Article queryArticleByID(int id) {
        return articleMapper.queryArticleByID(id);
    }

    @Override
    public List<Article> queryAllArticle() {
        return articleMapper.queryAllArticle();
    }
}

package com.memel.gestiondestock.service;

import com.memel.gestiondestock.model.Article;
import com.memel.gestiondestock.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    public Article getArticleById(Integer id) {
        return articleRepository.findById(id).orElse(null);
    }

    public Article createOrUpdateArticle(Article article) {
        return articleRepository.save(article);
    }

    public void deleteArticleById(Integer id) {
        articleRepository.deleteById(id);
    }

}

package com.memel.gestiondestock.repository;

import com.memel.gestiondestock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Integer> {
    List<Article> findByCodeArticleAndDesignation(@Param("code") String code, @Param("designation") String designation);
}

package com.memel.gestiondestock.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class Category{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "designation")
    private String destination;

    @OneToMany(mappedBy = "category")
    private List<Article> articles;

    Category(Integer id, Instant creationDate, Instant lastUpdatedDate) {
        super();
    }
}

package com.blog.blog_Dmitriev.models;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String body;

    @OneToOne
    @JoinColumn(name = "post")

    private Post post;
}

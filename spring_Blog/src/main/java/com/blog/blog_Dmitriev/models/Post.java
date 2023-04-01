package com.blog.blog_Dmitriev.models;


import java.util.Date;


import jakarta.persistence.*;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title, body;
    private Date creationDate;
}

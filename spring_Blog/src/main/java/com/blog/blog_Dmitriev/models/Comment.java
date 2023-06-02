package com.blog.blog_Dmitriev.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name = "id_generator", sequenceName = "posts_SEQ", allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long postId;
    private String author;
    private String body;
    private Date creationDate;

    public Comment(){}
    public Comment(Long postId,String author, String body, Date creationDate){
        this.postId = postId;
        this.author = author;
        this.body = body;
        this.creationDate = creationDate;
    }
    public String getAuthor() {
        return author;
    }
    public String getBody() {
        return body;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public Long getId() {
        return id;
    }
    public Long getPostId() {
        return postId;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    public void setId(Long id) {
        this.id = id;
    }
}

package com.blog.blog_Dmitriev.models;


import java.util.Date;


import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String body;
    private Date creationDate;

    public String getBody() {
        return body;
    }
    public String getTitle() {
        return title;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}

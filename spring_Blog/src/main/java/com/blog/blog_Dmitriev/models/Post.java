package com.blog.blog_Dmitriev.models;


import java.util.Date;


import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name = "id_generator", sequenceName = "posts_SEQ", allocationSize = 1)
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String body;
    private Date creationDate;

    public Post(){}
    public Post(String title, String body, Date creationDate){
        this.title = title;
        this.body = body;
        this.creationDate = creationDate;
    }
    public Long getId() {
        return id;
    }
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

package com.blog.blog_Dmitriev.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.blog_Dmitriev.models.Post;


public interface PostRepository extends JpaRepository<Post, Integer>{
    
}

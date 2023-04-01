package com.blog.blog_Dmitriev.repositories;


import org.springframework.data.repository.CrudRepository;

import com.blog.blog_Dmitriev.models.Comment;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepository extends JpaRepository<Comment,Integer>{
    
}

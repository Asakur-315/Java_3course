package com.blog.blog_Dmitriev.repositories;



import com.blog.blog_Dmitriev.models.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CommentRepository extends JpaRepository<Comment,Long>{
    @Query(
        value ="SELECT * FROM comments WHERE comments.post_id = ?1",
        nativeQuery = true)
    Iterable<Comment> findByPostId(Long postId);
}

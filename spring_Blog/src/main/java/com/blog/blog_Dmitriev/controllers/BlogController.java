package com.blog.blog_Dmitriev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.blog.blog_Dmitriev.models.Post;
import com.blog.blog_Dmitriev.repositories.PostRepository;


@Controller
public class BlogController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blog")
    public String  blogMain(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        System.out.println(posts);
        return "blog-main";
    }
}
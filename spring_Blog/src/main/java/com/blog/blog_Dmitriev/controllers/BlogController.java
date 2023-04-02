package com.blog.blog_Dmitriev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.blog_Dmitriev.models.Comment;
import com.blog.blog_Dmitriev.models.Post;
import com.blog.blog_Dmitriev.repositories.CommentRepository;
import com.blog.blog_Dmitriev.repositories.PostRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/")
    public String  blogMain(Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blog-main";
    }
    @GetMapping("/blog/new")
    public String  blogAdd(Model model){
        return "blog-new";
    }

    @PostMapping("blog/new")
    public String addPost(@RequestParam String title, @RequestParam String body, Model model){
        Post post = new Post(title,body,new Date());
        postRepository.save(post);
        return "redirect:/";
    }

    @GetMapping("/blog/{id}")
    public String  blogComments(@PathVariable(value = "id") Long id, Model model){
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        Iterable<Comment> comments = commentRepository.findByPostId(id);
        post.ifPresent(res::add);
        model.addAttribute("post", res);
        model.addAttribute("comments", comments);
        return "blog-comments";
    }

    @PostMapping("/blog/{id}")
    public String addComment(@PathVariable(value="id") Long postId, @RequestParam String author, @RequestParam String body, Model model){
        Comment comment = new Comment(postId,author,body, new Date());
        commentRepository.save(comment);
        return "redirect:/blog/{id}";
    }
}
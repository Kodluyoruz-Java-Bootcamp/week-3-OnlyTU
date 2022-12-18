package com.medium.controller;

import com.medium.model.Blog;
import com.medium.model.Draft;
import com.medium.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/blogs")
public class BlogController {

    @GetMapping
    public List<Blog> getAllBlogs(){
        BlogService blogService = new BlogService();
        return blogService.getBlogList();
    }
    @PostMapping
    public Draft create(@RequestBody Draft draft){
        BlogService blogService = new BlogService();
        blogService.createDraft(draft);
        return draft;
    }
    @PostMapping
    public Blog delete(@RequestBody Blog blog){
        BlogService blogService = new BlogService();
        blogService.deleteBlog(blog);
        return blog;
    }
    @PostMapping
    public Blog publish(@RequestBody Blog blog){
        BlogService blogService = new BlogService();
        blogService.publishBlog(blog);
        return blog;
    }
}

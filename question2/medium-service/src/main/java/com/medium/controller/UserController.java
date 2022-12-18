package com.medium.controller;


import com.medium.model.Blog;
import com.medium.model.Draft;
import com.medium.model.Tag;
import com.medium.model.User;
import com.medium.service.BlogService;
import com.medium.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/users")
public class UserController {

    @GetMapping
    public List<User> getAllUser(){
        UserService userService = new UserService();
        return userService.getAllUser();
    }
    @PostMapping
    public User create(@RequestBody User user){
        UserService userService = new UserService();
        userService.createUser(user);
        return user;
    }
    @GetMapping
    public List<Draft> getAllDrafts(){
        BlogService blogService = new BlogService();
        return blogService.getDraftList();
    }
    @GetMapping
    public List<Tag> getAllFavoriteTags(){
        UserService userService = new UserService();
        return userService.getTagList();
    }
    @GetMapping
    public List<Blog> showBlogList(){
        UserService userService = new UserService();
        return userService.showBlogList();
    }
    @PostMapping
    public Tag addFavoriteTags(@RequestBody Tag tag){
        UserService userService = new UserService();
        userService.addFavoriteTags(tag);
        return tag;
    }

}

package com.medium.service;

import com.medium.model.Blog;
import com.medium.model.Tag;
import com.medium.model.User;
import com.medium.repository.BlogRepo;
import com.medium.repository.TagRepo;
import com.medium.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    private static UserRepo userRepo = new UserRepo();

    private static TagRepo tagRepo = new TagRepo();

    public static BlogRepo blogRepo = new BlogRepo();

    public void createUser(User user){
        userRepo.createUser(user);
    }

    public List<User> getAllUser(){
        return userRepo.getAllUser();
    }

    public List<Tag> addFavoriteTags(Tag tag){
        return tagRepo.showAll();
    }

    public static List<Tag> getTagList() {
        return tagRepo.getTagList();
    }

    public List<Blog> showBlogList() {
        return blogRepo.showAll();
    }
}

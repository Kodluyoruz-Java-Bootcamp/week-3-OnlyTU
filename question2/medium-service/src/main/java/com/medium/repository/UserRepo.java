package com.medium.repository;

import com.medium.model.Tag;
import com.medium.model.User;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {
    private static List<User> userList = new ArrayList<>();

    private static List<Tag> tagList = new ArrayList<>();

    public void createUser(User user){
        userList.add(user);
    }

    public static List<User> getAllUser() {
        return userList;
    }

    public static List<Tag> getTagList() {
        return tagList;
    }

}


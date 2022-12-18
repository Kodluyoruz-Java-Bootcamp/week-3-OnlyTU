package com.medium.repository;

import com.medium.model.Blog;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BlogRepo {
    private static List<Blog> blogList = new ArrayList<>();

    public List<Blog> showAll(){
        return blogList;
    }

}

package com.medium.service;

import com.medium.model.Blog;
import com.medium.model.Draft;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {


    private static List<Blog> blogList =new ArrayList<>();

    private static List<Draft> draftList =new ArrayList<>();


    public void createDraft(Draft draft){
        draftList.add(draft);
    }
    public void publishBlog(Blog blog){
        blogList.add(blog);
    }
    public void deleteBlog(Blog blog){
        blogList.remove(blog);
    }

    public static List<Blog> getBlogList() {
        return blogList;
    }

    public static List<Draft> getDraftList() {
        return draftList;
    }
}

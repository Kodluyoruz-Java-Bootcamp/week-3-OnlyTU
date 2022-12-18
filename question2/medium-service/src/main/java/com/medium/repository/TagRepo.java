package com.medium.repository;

import com.medium.model.Tag;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TagRepo {
    private static List<Tag> tagList = new ArrayList<>();

    public List<Tag> showAll(){
        return tagList;
    }

    public void addFavoriteTags(Tag tag) {
        tagList.add(tag);
    }

    public static List<Tag> getTagList() {
        return tagList;
    }
}

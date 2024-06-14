package com.iamraghu.bloggy.blog;

import com.iamraghu.bloggy.exception.ResourceNotFound;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class BlogService {

    private final BlogDao blogDao;

    public BlogService(@Qualifier("jpa") BlogDao blogDao) {
        this.blogDao = blogDao;
    }

    public List<Blog> getAllBlogs() {
        return blogDao.getAllBlogs();
    }

    public Blog getBlogById(Integer blogId) {
        return blogDao.getBlogById(blogId)
                .orElseThrow(() -> new ResourceNotFound("No such blog exist. The blog ID you've passed is: %s".formatted(blogId)));
    }
}

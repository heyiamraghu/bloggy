package com.iamraghu.bloggy.blog;

import com.iamraghu.bloggy.author.Author;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("api/v1/blogs")
    public List<Blog> getBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("api/v1/blogs/{blogId}")
    public Blog getBlog(@PathVariable Integer blogId) {
        return blogService.getBlogById(blogId);
    }
}

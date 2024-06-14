package com.iamraghu.bloggy.blog;

import com.iamraghu.bloggy.author.Author;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository("list")
public class BlogDataAccessService implements BlogDao{

    private static List<Blog> blogs = new ArrayList<>();

    static {
        Blog blog1 = new Blog(
                1,
                "My first blog",
                "Use your Google or GitHub single sign-on or provide your email to create a new account. A valid payment method is required to validate your identity, but we will not charge you during your trial. Promotional credits are available only to new customers who have not signed up for a free trial.",
                new Author(
                        1,
                        "alex",
                        "alex@gmail.com"
                ),
                new Date()
        );
        blogs.add(blog1);
        Blog blog2 = new Blog(
                2,
                "My first blog",
                "Use your Google or GitHub single sign-on or provide your email to create a new account. A valid payment method is required to validate your identity, but we will not charge you during your trial. Promotional credits are available only to new customers who have not signed up for a free trial.",
                new Author(
                        2,
                        "john",
                        "john@gmail.com"
                ),
                new Date()
        );
        blogs.add(blog2);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogs;
    }

    @Override
    public Optional<Blog> getBlogById(Integer blogId) {
        return blogs.stream()
                .filter(blog -> blog.getId().equals(blogId))
                .findFirst();
    }
}

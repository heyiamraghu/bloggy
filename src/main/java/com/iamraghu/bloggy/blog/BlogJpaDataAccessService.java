package com.iamraghu.bloggy.blog;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("jpa")
public class BlogJpaDataAccessService implements BlogDao {
    private final BlogRepository blogRepository;

    public BlogJpaDataAccessService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> getBlogById(Integer blogId) {
        return Optional.empty();
    }
}

package com.iamraghu.bloggy.blog;

import java.util.List;
import java.util.Optional;

public interface BlogDao {
    List<Blog> getAllBlogs();
    Optional<Blog> getBlogById(Integer blogId);
}

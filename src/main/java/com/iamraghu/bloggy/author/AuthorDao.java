package com.iamraghu.bloggy.author;

import java.util.List;
import java.util.Optional;

public interface AuthorDao {
    List<Author> findAllAuthors();
    Optional<Author> findAuthorById(Integer authorId);
}

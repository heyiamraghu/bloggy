package com.iamraghu.bloggy.author;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AuthorDataAccessService implements AuthorDao {

    private static List<Author> authors;

    static {
        authors = new ArrayList<>();
        Author alex = new Author(
                1,
                "Alex",
                "alex@gmail.com"
        );
        authors.add(alex);
        Author john = new Author(
                2,
                "John",
                "john@gmail.com"
        );
        authors.add(john);
    }

    @Override
    public List<Author> findAllAuthors() {
        return authors;
    }

    @Override
    public Optional<Author> findAuthorById(Integer authorId) {
        return authors.stream()
                .filter(author -> author.getId().equals(authorId))
                .findFirst();
    }
}

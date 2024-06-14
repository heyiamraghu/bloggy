package com.iamraghu.bloggy.author;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("api/v1/authors")
    public List<Author> getAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("api/v1/authors/{authorId}")
    public Author getAuthor(@PathVariable("authorId") Integer authorId) {
        return authorService.getAuthorById(authorId);
    }
}

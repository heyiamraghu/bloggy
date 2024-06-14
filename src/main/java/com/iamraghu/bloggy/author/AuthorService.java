package com.iamraghu.bloggy.author;

import com.iamraghu.bloggy.exception.ResourceNotFound;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorDao authorDao;

    public AuthorService(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    public List<Author> getAllAuthors() {
        return authorDao.findAllAuthors();
    }

    public Author getAuthorById(Integer id) {
        return authorDao.findAuthorById(id)
                .orElseThrow(() -> new ResourceNotFound("Author not found. ID passed: [%s]".formatted(id)));
    }
}

package com.iamraghu.bloggy.blog;

import com.iamraghu.bloggy.author.Author;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Blog {

    @Id
    @SequenceGenerator(name = "blog_id_sequence", sequenceName = "blog_id_sequence")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "blog_id_sequence"
    )
    private Integer id;
    @Column(nullable = false)
    private String title;
    @Column(
            nullable = false

    )
    private String content;
    @Column(nullable = false)
    private Date publishedDate;
    private Integer authorId;

    public Blog() {}

    public Blog(Integer id, String title, String content, Integer authorId, Date publishedDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publishedDate = publishedDate;
        this.authorId = authorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }


}

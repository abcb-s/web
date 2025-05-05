package com.example.yakoko2.Entity;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;


    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();

    // 기본 생성자
    public Post() {
    }

    // 생성자
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getter/Setter
    public Long getId() {
        return id;
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

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
        comment.setPost(this); // 연관관계 설정
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
        comment.setPost(null); // 연관관계 해제

    }

}
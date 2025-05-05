package com.example.yakoko2.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.example.yakoko2.Entity.Post;
import com.example.yakoko2.Entity.User;
import java.util.ArrayList;
import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ★ 자동으로 ID 생성
    private Long id;

    private String content; // 실제 댓글 내용

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // getter, setter 등 생략



    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;


    public void setPost(Post post) {
        this.post = post;
    }

}


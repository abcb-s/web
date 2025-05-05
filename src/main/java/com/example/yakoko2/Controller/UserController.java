package com.example.yakoko2.Controller;


import com.example.yakoko2.Entity.Comment;
import com.example.yakoko2.Repository.CommentRepository;
import com.example.yakoko2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@org.springframework.stereotype.Controller
public class UserController {
    @Autowired

    private UserRepository userRepository;
    private CommentRepository commentRepository;

    @GetMapping("/")
    public String homeyakoko() {
        return "Home";
    }

    @GetMapping("/video")
    public String videoyakoko() {
        return "Video";
    }

    @GetMapping("/profile")
    public String profileyakoko() {
        return "Profile";
    }








}

package com.example.yakoko2.Controller;

import com.example.yakoko2.Entity.Comment;
import com.example.yakoko2.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CommentController {



    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping("/comments")
    public String getComments(Model model) {
        List<Comment> comments = commentRepository.findAll();
        model.addAttribute("comments", comments);
        return "Comments";
    }
    @PostMapping("/comments")
    public String submitComment(@ModelAttribute Comment comment) {
        commentRepository.save(comment);
        return "redirect:/comments";
    }

}
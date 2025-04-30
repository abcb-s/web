package com.example.yakoko2.Controller;


import com.example.yakoko2.Entity.User;
import com.example.yakoko2.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@org.springframework.stereotype.Controller
public class UserController {
    @Autowired

    private UserRepository userRepository;

    @GetMapping("main")
    public String mainyakoko() {
        return "mainyakoko";
    }

    @GetMapping("video")
    public String videoyakoko() {
        return "videoyakoko";
    }

    @GetMapping("profile")
    public String profileyakoko() {
        return "profileyakoko";
    }

    @GetMapping("write")
    public String writeyakoko() {
        return "writeyakoko";
    }

    @PostMapping("write")
    public String inputYakoko(@RequestParam("value") String write) {
        User Yakoko = new User();
        Yakoko.setValue(write);
        Yakoko = userRepository.save(Yakoko);
        return "writeyakoko";

    }



}

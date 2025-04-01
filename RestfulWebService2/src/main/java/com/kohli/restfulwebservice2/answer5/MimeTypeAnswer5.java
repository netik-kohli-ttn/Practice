package com.kohli.restfulwebservice2.answer5;

import com.kohli.restfulwebservice2.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class MimeTypeAnswer5 {

    private final User user;

    @Autowired
    public MimeTypeAnswer5(User user) {
        this.user = user;
    }

    @GetMapping(value = "/details", produces = "application/vnd.company.app-v1+json")
    public String getUserV1() {
        user.setName("John");
        user.setAge(30);
        return "Name: " + user.getName()+ "\n Age: " + user.getAge();
    }

    @GetMapping(value = "/details", produces = "application/vnd.company.app-v2+json")
    public User getUserV2() {
        user.setName("John");
        user.setAge(30);
        return user;
    }
}


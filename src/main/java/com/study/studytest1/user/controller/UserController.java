package com.study.studytest1.user.controller;

import com.study.studytest1.user.service.UserService;
import com.study.studytest1.user.vo.Role;
import com.study.studytest1.user.vo.UserVo;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {



    private final UserService userService;

    @GetMapping(value = "join-page")
    public String userJoinPage() {
        return "user/join";
    }

    @GetMapping(value = "sign-up")
    public String userSingUpPage() {
        return "user/sign-up";
    }

    @PostMapping(value = "join")
    public String userJoin(@RequestBody UserVo userVo) throws Exception {

        int result = userService.joinUser(userVo);

        return "redirect:join-page";
    }


}
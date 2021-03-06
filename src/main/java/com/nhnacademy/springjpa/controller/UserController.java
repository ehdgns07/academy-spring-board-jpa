package com.nhnacademy.springjpa.controller;

import com.nhnacademy.springjpa.service.UserService;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/login")
    public String goLoginForm() {
        return "users/form";
    }

    @PostMapping("/login")
    public String loginToBoard(@RequestParam("username") String userName,
                               @RequestParam("password") String password,
                               HttpServletRequest request,
                               HttpServletResponse response) throws IOException {

        boolean isLoginSuccess = userService.doLogin(userName, password, request);

        if (isLoginSuccess) {
            response.sendRedirect("/posts/index?page=0&size=20");
            return null;
        }

        response.sendRedirect("/login");
        return null;
    }

}

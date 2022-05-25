package com.nhnacademy.springjpa.service;

import javax.servlet.http.HttpServletRequest;

public interface UserService {
    boolean doLogin(String userName, String password, HttpServletRequest request);
}

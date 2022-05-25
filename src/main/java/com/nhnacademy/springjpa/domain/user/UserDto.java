package com.nhnacademy.springjpa.domain.user;

import org.springframework.beans.factory.annotation.Value;

public interface UserDto {
    @Value("#{target.userNo}")
    Long getUserNo();
    @Value("#{target.username}")
    String getUsername();
    @Value("#{target.password}")
    String getPassword();
}

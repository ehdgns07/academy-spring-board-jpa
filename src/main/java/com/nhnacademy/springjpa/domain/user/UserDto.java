package com.nhnacademy.springjpa.domain.user;

import org.springframework.beans.factory.annotation.Value;

public interface UserDto {

    Long getUserNo();

    String getUsername();

    String getPassword();
}

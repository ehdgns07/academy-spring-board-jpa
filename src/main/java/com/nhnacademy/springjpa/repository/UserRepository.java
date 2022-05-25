package com.nhnacademy.springjpa.repository;

import com.nhnacademy.springjpa.domain.user.UserDto;
import com.nhnacademy.springjpa.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    UserDto findByUsername(String username);
}

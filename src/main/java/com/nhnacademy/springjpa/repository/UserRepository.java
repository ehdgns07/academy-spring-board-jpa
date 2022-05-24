package com.nhnacademy.springjpa.repository;

import com.nhnacademy.springjpa.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

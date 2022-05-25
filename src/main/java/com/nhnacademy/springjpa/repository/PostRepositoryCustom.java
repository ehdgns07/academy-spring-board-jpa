package com.nhnacademy.springjpa.repository;

import com.nhnacademy.springjpa.entity.post.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PostRepositoryCustom {
    Page<Post> getPosts(Pageable pageable);
}

package com.nhnacademy.springjpa.repository;

import com.nhnacademy.springjpa.domain.post.PostItem;
import com.nhnacademy.springjpa.domain.post.PostItemDto;
import com.nhnacademy.springjpa.entity.post.Post;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PostRepositoryCustom {
    PageImpl<PostItemDto> getPosts(Pageable pageable);

}

package com.nhnacademy.springjpa.service;

import com.nhnacademy.springjpa.domain.post.PostNewRequest;
import com.nhnacademy.springjpa.entity.post.Post;
import javax.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {
    Page<Post> getPagingPosts(Pageable pageable);

    Post getPost(Long postNo);

    void newPost(PostNewRequest postRequest, HttpServletRequest request);

    void doReplyPost(PostNewRequest postRequest, HttpServletRequest request);

    Post editPost(PostNewRequest postEditRequest);
}

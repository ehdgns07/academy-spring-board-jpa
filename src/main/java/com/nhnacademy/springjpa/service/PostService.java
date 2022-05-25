package com.nhnacademy.springjpa.service;

import com.nhnacademy.springjpa.domain.post.PostNewRequest;
import com.nhnacademy.springjpa.entity.post.Post;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface PostService {
    List<Post> getPagingPosts(Pageable pageable);

    Post getPost(Long postNo);

    void newPost(PostNewRequest postRequest, HttpServletRequest request);

    void doReplyPost(PostNewRequest postRequest, HttpServletRequest request);

    Post editPost(PostNewRequest postEditRequest);
}

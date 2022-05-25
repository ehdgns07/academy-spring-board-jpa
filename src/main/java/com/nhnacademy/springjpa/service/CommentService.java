package com.nhnacademy.springjpa.service;

import com.nhnacademy.springjpa.domain.comment.CommentItem;
import com.nhnacademy.springjpa.domain.comment.CommentNewRequest;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public interface CommentService {
    List<CommentItem> getCommentsInPost(Long postNo);

    void newComment(CommentNewRequest commentRequest, HttpServletRequest request);

    CommentItem getComment(Long commentNo, HttpServletRequest request);

    void editComment(CommentNewRequest commentRequest);
}

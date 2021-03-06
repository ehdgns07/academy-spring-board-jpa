package com.nhnacademy.springjpa.controller;

import com.nhnacademy.springjpa.domain.post.PostItem;
import com.nhnacademy.springjpa.domain.post.PostItemDto;
import com.nhnacademy.springjpa.domain.post.PostNewRequest;
import com.nhnacademy.springjpa.entity.post.Post;
import com.nhnacademy.springjpa.service.CommentService;
import com.nhnacademy.springjpa.service.PostService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
// @RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    private final CommentService commentService;

    @GetMapping("/posts/index")
    public PageImpl<PostItemDto> index(Pageable pageable) {
         return postService.getPagingPosts(pageable);
    }

    // // @GetMapping("/page/{pageNo}")
    // // public ModelAndView index(@PathVariable Long pageNo) {
    // //     ModelAndView mav = new ModelAndView("posts/index");
    // //
    // //     Pageable pageable = new MySqlPaginator(0, new Page(pageNo, 4));
    // //     mav.addObject("pagination", pageable);
    // //     mav.addObject("posts", postService.getPagingPosts(pageable));
    // //
    // //     return mav;
    // // }
    //
    // @GetMapping("/{postNo}")
    // public ModelAndView postDetail(@PathVariable Long postNo) {
    //     ModelAndView mav = new ModelAndView("posts/post");
    //     mav.addObject("post", postService.getPost(postNo));
    //     mav.addObject("comment", commentService.getCommentsInPost(postNo));
    //
    //     return mav;
    // }
    //
    // @GetMapping("/new")
    // public String newPost() {
    //     return "posts/new";
    // }
    //
    // @PostMapping("/new")
    // public String doNewPost(@ModelAttribute PostNewRequest postRequest,
    //                         HttpServletRequest request) {
    //
    //     postService.newPost(postRequest, request);
    //
    //     return "redirect:/posts";
    // }
    //
    // @GetMapping("/{postNo}/edit")
    // public ModelAndView editPost(@PathVariable Long postNo) {
    //     ModelAndView mav = new ModelAndView("posts/edit");
    //     mav.addObject("postNo", postNo);
    //     mav.addObject("post", postService.getPost(postNo));
    //
    //     return mav;
    // }
    //
    // // @PutMapping("/{postNo}/edit")
    // // public ModelAndView doEditPost(@RequestParam("title")String title, @RequestParam("content")String content) {
    // //     // TODO: Validation -> index | postDetail
    // //     ModelAndView mav = new ModelAndView("posts/post");
    // //     mav.addObject("post", postService.edit(title, content));
    // //     // return "posts/edit";
    // //     return null;
    // // }
    //
    // @PostMapping("/{postNo}/edit")
    // public ModelAndView doEditPost(@ModelAttribute PostNewRequest postEditRequest) {
    //     // TODO: Validation -> index | postDetail
    //     ModelAndView mav = new ModelAndView("posts/index");
    //     mav.addObject("post", postService.editPost(postEditRequest));
    //     // return "posts/edit";
    //     return mav;
    // }
    //
    // @GetMapping("/delete")
    // public String deletePost() {
    //     return "posts/delete";
    // }
    //
    // @DeleteMapping("/delete")
    // public String doDeletePost() {
    //     return null;
    // }
    //
    // @GetMapping("/reply/{postNo}")
    // public ModelAndView reply(@PathVariable Long postNo) {
    //     ModelAndView mav = new ModelAndView("posts/reply");
    //     mav.addObject("postNo", postNo);
    //
    //     return mav;
    // }
    //
    // @PostMapping("/reply/{parentPostNo}")
    // public String doReply(@ModelAttribute PostNewRequest postRequest, HttpServletRequest request) {
    //     postService.doReplyPost(postRequest, request);
    //
    //     return "redirect:/posts";
    // }
}

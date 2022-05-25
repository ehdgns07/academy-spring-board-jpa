package com.nhnacademy.springjpa.entity;

import static org.assertj.core.api.Assertions.assertThat;

import com.nhnacademy.springjpa.config.RootConfig;
import com.nhnacademy.springjpa.config.WebConfig;
import com.nhnacademy.springjpa.entity.comment.Comment;
import com.nhnacademy.springjpa.entity.post.Post;
import com.nhnacademy.springjpa.entity.user.User;
import com.nhnacademy.springjpa.repository.PostRepository;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@Transactional
@ContextHierarchy({
    @ContextConfiguration(classes = RootConfig.class),
    @ContextConfiguration(classes = WebConfig.class)
})
public class PostEntityTest {
    // @PersistenceContext
    // private EntityManager entityManager;
    //
    // @Autowired
    // PostRepository postRepository;
    //
    // @Test
    // public void testPostEntity(){
    //     Post post1 = entityManager.find(Post.class, 1L);
    //
    //     assertThat(post1.getPostNo().longValue()).isEqualTo(1L);
    //     assertThat(post1.getContent()).isEqualTo("dfsdfs");
    //
    // }
    //
    // @Test
    // public void PostTest(){
    //     Post post1 = new Post();
    //     post1.setContent("test");
    //     post1.setCreatedAt(LocalDateTime.now());
    //     post1.setTitle("Title");
    //     post1.setPostGroupNo(1L);
    //     post1.setPostGroupSeq(1L);
    //     post1.setPostDepth(0);
    //
    //     User user = new User();
    //     user.setPassword("123");
    //     user.setUsername("liverbird");
    //     user.setRoleCode("사용자");
    //     post1.setUser(user);
    //
    //     Comment comment = new Comment();
    //     comment.setContent("comment");
    //     comment.setCreatedAt(LocalDateTime.now());
    //     comment.setUser(user);
    //
    //     post1.addComment(comment);
    //
    //     postRepository.save(post1);
    //
    //     assertThat(post1.getUser().getUserNo()).isEqualTo(user.getUserNo());
    //
    //     postRepository.flush();
    //
    //
    // }
}

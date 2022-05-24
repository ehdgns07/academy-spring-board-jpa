package com.nhnacademy.springjpa.entity;

import static org.assertj.core.api.Assertions.assertThat;

import com.nhnacademy.springjpa.config.RootConfig;
import com.nhnacademy.springjpa.config.WebConfig;
import com.nhnacademy.springjpa.entity.comment.Comment;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lombok.experimental.StandardException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
@Transactional
@WebAppConfiguration
@ContextHierarchy({
    @ContextConfiguration(classes = RootConfig.class),
    @ContextConfiguration(classes = WebConfig.class)
})
public class CommentEntityTest {
    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void commentTest(){
        Comment comment = entityManager.find(Comment.class, 1L);

        assertThat(comment.getContent()).isEqualTo("cccccccccccc");


    }
}

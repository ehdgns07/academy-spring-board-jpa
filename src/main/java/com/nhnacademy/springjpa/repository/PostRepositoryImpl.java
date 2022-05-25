package com.nhnacademy.springjpa.repository;

import com.nhnacademy.springjpa.entity.post.Post;
import com.nhnacademy.springjpa.entity.post.QPost;
import com.nhnacademy.springjpa.entity.user.QUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class PostRepositoryImpl extends QuerydslRepositorySupport implements PostRepositoryCustom {

    public PostRepositoryImpl() {
        super(Post.class);
    }

    @Override
    public Page<Post> getPosts(Pageable pageable) {
        QPost post = QPost.post;
        QUser user = QUser.user;


        return from(post)
            .innerJoin(user)
            .on(post.user.userNo.eq(user.userNo))
            .where(post.postNo.gt(0))
            .orderBy(post.postNo.desc())
            .orderBy(post.createdAt.desc())
            .stream().limit()
            
    }
}

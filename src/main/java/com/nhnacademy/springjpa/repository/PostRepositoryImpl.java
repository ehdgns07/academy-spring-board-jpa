package com.nhnacademy.springjpa.repository;

import com.nhnacademy.springjpa.domain.post.PostItem;
import com.nhnacademy.springjpa.domain.post.PostItemDto;
import com.nhnacademy.springjpa.domain.post.QPostItemDto;
import com.nhnacademy.springjpa.entity.post.Post;
import com.nhnacademy.springjpa.entity.post.QPost;
import com.nhnacademy.springjpa.entity.user.QUser;
import com.querydsl.core.annotations.QueryProjection;
import com.querydsl.core.types.ExpressionBase;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.beans.Expression;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class PostRepositoryImpl extends QuerydslRepositorySupport implements PostRepositoryCustom {

    public PostRepositoryImpl() {
        super(Post.class);
    }

    @Override
    public PageImpl<PostItemDto> getPosts(Pageable pageable) {
        QPost post = QPost.post;
        QUser user = QUser.user;

        JPQLQuery<PostItemDto> query = from(post)
            .innerJoin(post.user, user)
            .where(post.postNo.gt(0))
            .orderBy(post.postNo.desc())
            .orderBy(post.createdAt.desc())
            .select(Projections.bean(PostItemDto.class, post.postNo, post.title, post.content, post.createdAt,
                post.postDepth, post.postGroupNo, post.postGroupSeq));


         Long totalCount = query.fetchCount();
         List<PostItemDto> resultCount = getQuerydsl().applyPagination(pageable, query).fetch();

        return new PageImpl<>(resultCount, pageable, totalCount);
    }
}

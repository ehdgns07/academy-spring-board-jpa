package com.nhnacademy.springjpa.entity.post;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPost is a Querydsl query type for Post
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPost extends EntityPathBase<Post> {

    private static final long serialVersionUID = -1259587892L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPost post = new QPost("post");

    public final ListPath<com.nhnacademy.springjpa.entity.comment.Comment, com.nhnacademy.springjpa.entity.comment.QComment> comments = this.<com.nhnacademy.springjpa.entity.comment.Comment, com.nhnacademy.springjpa.entity.comment.QComment>createList("comments", com.nhnacademy.springjpa.entity.comment.Comment.class, com.nhnacademy.springjpa.entity.comment.QComment.class, PathInits.DIRECT2);

    public final StringPath content = createString("content");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> deletedAt = createDateTime("deletedAt", java.time.LocalDateTime.class);

    public final NumberPath<Integer> postDepth = createNumber("postDepth", Integer.class);

    public final NumberPath<Long> postGroupNo = createNumber("postGroupNo", Long.class);

    public final NumberPath<Long> postGroupSeq = createNumber("postGroupSeq", Long.class);

    public final NumberPath<Long> postNo = createNumber("postNo", Long.class);

    public final StringPath title = createString("title");

    public final DateTimePath<java.time.LocalDateTime> updatedAt = createDateTime("updatedAt", java.time.LocalDateTime.class);

    public final com.nhnacademy.springjpa.entity.user.QUser user;

    public QPost(String variable) {
        this(Post.class, forVariable(variable), INITS);
    }

    public QPost(Path<? extends Post> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPost(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPost(PathMetadata metadata, PathInits inits) {
        this(Post.class, metadata, inits);
    }

    public QPost(Class<? extends Post> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new com.nhnacademy.springjpa.entity.user.QUser(forProperty("user")) : null;
    }

}


package com.nhnacademy.springjpa.domain.post;

import com.querydsl.core.annotations.QueryProjection;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PostItemDto {
    
    Long PostNo;

    String Title;

    String Content;

    LocalDateTime CreatedAt;

    Integer PostDepth;

    Long PostGroupNo;

    Long PostGroupSeq;

    @QueryProjection
    public PostItemDto(Long PostNo, String Title, String Content,
                       LocalDateTime CreatedAt, Integer PostDepth, Long PostGroupNo,
                       Long PostGroupSeq) {
        this.PostNo = PostNo;
        this.Title = Title;
        this.Content = Content;
        this.CreatedAt = CreatedAt;
        this.PostDepth = PostDepth;
        this.PostGroupNo = PostGroupNo;
        this.PostGroupSeq = PostGroupSeq;
    }

    public PostItemDto(){

    }
}

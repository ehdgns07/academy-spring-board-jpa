package com.nhnacademy.springjpa.entity.post;

import com.nhnacademy.springjpa.entity.comment.Comment;
import com.nhnacademy.springjpa.entity.user.User;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_no")
    private Long postNo;

    @Transient
    private String userName;

    private String title;

    private String content;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "deleted_at")
    private Date deletedAt;

    @Column(name = "post_depth")
    private Integer postDepth;

    @Column(name = "post_group_no")
    private Long postGroupNo;

    @Column(name = "post_group_seq")
    private Long postGroupSeq;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_no")
    private User user;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList = new ArrayList<>();

    public void addComment(Comment comment){
        comment.setPost(this);
        commentList.add(comment);
    }

}

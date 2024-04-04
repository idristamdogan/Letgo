package com.idrist.repository;

import com.idrist.entity.Comment;


public class CommentRepository extends RepositoryManager<Comment, Long>{
    public CommentRepository() {
        super(Comment.class);
    }



}

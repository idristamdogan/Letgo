package com.idrist.service;

import com.idrist.repository.CommentRepository;

public class CommentService {
    CommentRepository commentRepository;

    public CommentService() {
        this.commentRepository = new CommentRepository();
    }
}

package com.dtdream.comment.controller;

import com.dtdream.comment.service.CommentService;
import com.dtdream.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 点评controller
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;
    @RequestMapping("/getCommentById")
    public String getCommentById(String commentId){
        Comment comment = commentService.selectByPrimaryKey(commentId);

        return null;
    }
}

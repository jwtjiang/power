package com.dtdream.comment.service.serviceImpl;

import com.dtdream.comment.dao.CommentMapper;
import com.dtdream.comment.service.CommentService;
import com.dtdream.pojo.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentMapper commentMapper;

    @Override
    public Comment selectByPrimaryKey(String commentid) {
        return commentMapper.selectByPrimaryKey(commentid);
    }

    @Override
    public int insertComment(Comment comment) {
        return commentMapper.insert(comment);
    }
}

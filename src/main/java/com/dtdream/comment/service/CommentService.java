package com.dtdream.comment.service;

import com.dtdream.pojo.Comment;

/**
 * 点评service
 */
public interface CommentService {
    /**
     * 根据点评id查询
     * @param commentid
     * @return
     */
    Comment selectByPrimaryKey(String commentid);

    int insertComment(Comment comment);
}

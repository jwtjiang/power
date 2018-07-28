<<<<<<< HEAD
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
=======
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
>>>>>>> 7942b11a60b5f5a0ecd32a53572d0fd8e9ca9cb2

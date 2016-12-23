package com.haier.service;

import com.haier.dao.CommentDao;
import com.haier.po.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16 0016.
 */
@Service
public class CommentService {

    @Autowired
    private CommentDao commentDao;

    // 通过商品名称来获取评论，

    public List<Comment> getCommentByName(String name){
        return commentDao.getCommentByName(name);
    }

   //保存评论
 public List<Comment> getCommentAll(){
       return   commentDao.getCommentAll();
    }

    public Comment saveComment(Comment comment){
        return commentDao.saveComment(comment);
    }
    public  Comment updateComment(Comment comment){
        return  commentDao.updateComment(comment);
    }
    public void deleteComment(int id){
        commentDao.deleteCommentId(id);

    }
}

package com.haier.dao;

import com.haier.po.Comment;
import com.season.core.db.Dao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16 0016.
 */
@Repository
public class CommentDao {

    public List<Comment> getCommentByName(String name){
        return Dao.findByColumn(Comment.class,"name",name);
    }

    /**
     * 保存评论
     * @paramtianfeng
     * @return 当前保存的评论，具有所有字段信息
     */
    public Comment saveComment(Comment comment){
        return comment.save();
    }
}

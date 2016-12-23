package com.haier.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.haier.po.Comment;
import com.haier.service.CommentService;
import com.haier.utils.Utils;
import com.season.core.ActionKey;
import com.season.core.Controller;
import com.season.core.ControllerKey;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2016/12/16 0016.
 */
@ControllerKey(value = "hello")
public class CommentController extends Controller{
    @Autowired
    private CommentService commentService;

    @ActionKey(value = "get")
    public void getCommentByName(){
        String commentName=getPara("name");
        if(Utils.hasLength(commentName)){
            List<Comment> lists=commentService.getCommentByName(commentName);
//           System.out.println("接受到要返回数据！！！");
            renderText(((JSON) JSONArray.toJSON(lists)).toJSONString());
            return;
        }else{
            renderText("参数未赋值！");
        }
    }

    @ActionKey(value = "save")
    public void saveComment(){
        String commentName=getPara("name");
        String conmmentContent=getPara("content");
        if(Utils.hasLength(commentName) && Utils.hasLength(conmmentContent)){
            Comment conmment=new Comment(commentName,conmmentContent);
            commentService.saveComment(conmment);
            return;
        }else{
            renderText("缺少参数值！");
        }

      @ActionKey("update")
     public void updateComment(){
        int icommentId = Integer.valueOf(getPara("id"));
        String scommentContent=getPara("content");
        Date odate=new Date();
        Comment comment=new Comment();
        comment.setId(icommentId);
        comment.setContent(scommentContent);
        commentService.updateComment(comment);

    }
    @ActionKey("delete")
    public void deleteComment() {
        int icommentId = Integer.valueOf(getPara("id"));
        commentService.deleteComment(icommentId);
        return;
    }
        
    }
}

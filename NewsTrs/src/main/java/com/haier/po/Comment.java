package com.haier.po;

import com.season.core.db.Pojo;
import com.season.core.db.annotation.TableInfo;
import com.season.core.db.annotation.Transient;

import java.util.Date;

/**
 * Created by Administrator on 2016/12/16 0016.
 */
@TableInfo(tableName =Comment.tableName ,pkName = "id")
public class Comment extends Pojo<Comment>{
    @Transient
    public final static String tableName="comment";
    private Integer id;
    private  String name;
    private  String content;
    private Date Date;

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public Comment() {
    }
    public Comment(Integer id, String name, String content, java.util.Date date) {
        this.id = id;
        this.name = name;
        this.content = content;
        Date = date;
    }

    public Comment(String name, String content) {
        this.name = name;
        this.content = content;
    }
}

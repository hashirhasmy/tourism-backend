package com.sahan.csd63.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="tbl_post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String caption;
    private String description;
    private String time;
    private int tbl_user_id;
    private String signin_type;

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getTbl_user_id() {
        return tbl_user_id;
    }

    public void setTbl_user_id(int tbl_user_id) {
        this.tbl_user_id = tbl_user_id;
    }

    public String getSignin_type() {
        return signin_type;
    }

    public void setSignin_type(String signin_type) {
        this.signin_type = signin_type;
    }
}

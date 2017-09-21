package com.finsage.web.login.model;

/**
 * Created by knigh on 2017/9/21.
 */
public class UserModelBean {

    private Integer userId;

    private String username;

    private String birthday;

    private String phone;

    private String levelName;

    private String status;

    public UserModelBean() {
    }

    public UserModelBean(Integer userId, String username, String birthday, String phone, String levelName,
                         String status) {
        this.userId = userId;
        this.username = username;
        this.birthday = birthday;
        this.phone = phone;
        this.levelName = levelName;
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

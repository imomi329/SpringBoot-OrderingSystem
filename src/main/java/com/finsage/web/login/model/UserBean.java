package com.finsage.web.login.model;

/**
 * Created by knigh on 2017/9/21.
 */
public class UserBean {

    private Integer id;

    private String userId;

    private String account;

    private String password;

    private Integer status;

    public UserBean() {
    }

    public UserBean(Integer id, String userId, String account, String password, Integer status) {
        this.id = id;
        this.userId = userId;
        this.account = account;
        this.password = password;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

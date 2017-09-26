package com.finsage.security;

import org.apache.shiro.web.servlet.SimpleCookie;

/**
 * Created by Kal on 2017/9/26.
 */
public class BaseCookie extends SimpleCookie {
    public BaseCookie(){
        setHttpOnly(true);
        setMaxAge(-1);
    }
}

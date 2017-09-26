package com.finsage.security;

import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;

/**
 * Created by Kal on 2017/9/26.
 */
public class BaseSessionManager extends DefaultWebSessionManager {
     public BaseSessionManager(){
        setGlobalSessionTimeout(180000);
        setDeleteInvalidSessions(true);
        setSessionValidationSchedulerEnabled(true);
        setSessionIdCookieEnabled(true);
        setSessionIdCookie(new BaseCookie());
     }

}

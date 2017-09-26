package com.finsage.security;

import com.finsage.web.user.mapper.UserMapper;
import com.finsage.web.user.model.User;
import com.finsage.web.user.model.UserInfo;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Kal on 2017/9/26.
 */
public class BaseRealm extends AuthorizingRealm {
    @Autowired
    UserMapper userMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        SimpleAuthenticationInfo info = null;
        UsernamePasswordToken upt = (UsernamePasswordToken) token;
        String username = upt.getUsername();
        User user = new User();
        user.setAccount(username);
        user.setStatus("1");
        user = userMapper.selectByAccount(user);
        try {
            String password =user.getPassword();
            UserInfo userinfo = userMapper.queryUserInfoByusername(username);
            Object cred = password;
            String realname = this.getName();
            info = new SimpleAuthenticationInfo(userinfo, cred, realname);
        } catch (AuthenticationException ae) {
            throw new AuthenticationException();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return info;
    }
}

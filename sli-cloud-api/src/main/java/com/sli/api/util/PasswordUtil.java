package com.sli.api.util;

import com.sli.api.domain.SysUser;
import com.sli.common.core.utils.Md5Utils;

public class PasswordUtil
{
    public static boolean matches(SysUser user, String newPassword)
    {
        return user.getPassword().equals(encryptPassword(user.getLoginName(), newPassword, user.getSalt()));
    }

    public static String encryptPassword(String username, String password, String salt)
    {
        return Md5Utils.hash(username + password + salt);
    }
}
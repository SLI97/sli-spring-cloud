package com.sli.auth.form;

import lombok.Data;

@Data
public class LoginForm
{
    private String    username;

    private String    password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 滑块验证码二次验证参数
//    private CaptchaVO captchaVO;
}

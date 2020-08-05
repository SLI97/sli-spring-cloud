package com.sli.auth.form;

import lombok.Data;

@Data
public class LoginForm
{
    private String    username;

    private String    password;

    // 滑块验证码二次验证参数
    private CaptchaVO captchaVO;
}

package com.work.mylogin.controller;

import com.work.mylogin.baseClass.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import com.work.mylogin.baseClass.User;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@Controller
public class LoginController {

    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser){
        String name = requestUser.getName();
        String password = requestUser.getPassword();
        name = HtmlUtils.htmlEscape(name);

        if (Objects.equals(name, "ygp")&&Objects.equals(password, "123456")){
            return new Result(200, "success");
        }else{
            return new Result(400, "fail");
        }
    }
}

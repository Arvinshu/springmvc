package com.arvin.controller;

import com.arvin.model.UserEntity;
import com.arvin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Arvin on 2016/5/7.
 */

//@Controller注解可明确地定义该类为处理请求的Controller类
//如果请求首页，则返回index页面，页面文件格式在dispatcher中定义
@Controller
public class MainController {


    @RequestMapping(value = "/", method = RequestMethod.GET)

    public String index() {
        //log.info("Requesting /");
        return "main";
    }
}

package org.gwh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试
 */
@Controller
public class HelloTest {

    @RequestMapping("/test")
    public String test(){
        return "Hello";
    }

}

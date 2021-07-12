package edu.bit.mythymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JspController {

    @RequestMapping("/jsp")
    public String jsp() throws Exception {
        return "main";
    }

    @RequestMapping("/abcd")
    public String abcd() throws Exception {
        return "abcd";
    }

    @RequestMapping("/abcd2")
    public @ResponseBody String abcd2() throws Exception {
        return "abcd2";
    }

}
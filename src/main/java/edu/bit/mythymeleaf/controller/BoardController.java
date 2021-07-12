package edu.bit.mythymeleaf.controller;

import edu.bit.mythymeleaf.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;


    @GetMapping("/board/list")
    public String list(Model model) {
        log.info("list()...");
        model.addAttribute("list",boardService.getList());

        return "list";
    }



   @GetMapping("/board/tables")
    public String tables(Model model) {
        log.info("tables()...");
        model.addAttribute("list",boardService.getList());

        return "tables";
    }

}

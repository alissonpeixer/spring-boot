package com.saturno.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

import com.saturno.projeto.dto.IndexDto;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String indexGetRoute(Model model) {

        IndexDto indexDto = new IndexDto();

        model.addAttribute("indexDto", indexDto);

        return "main/index";
    }

    @PostMapping
    public String indexPostRoute(@ModelAttribute IndexDto indexDto, Model model) {
        model.addAttribute("indexDto", indexDto);

        return "main/result";
    }
}

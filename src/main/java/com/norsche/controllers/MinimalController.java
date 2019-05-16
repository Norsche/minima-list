package com.norsche.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "anime")
public class MinimalController {

    // Request path: /anime
    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "My Anime Minima-List");
        return "anime/index";
    }
}

package com.norsche.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "anime")
public class MinimalController {

    static ArrayList<String> anime_alist = new ArrayList<>();

    // Request path: /anime
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("anime_alist", anime_alist);
        model.addAttribute("title", "My Anime Minima-List");

        return "anime/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddAnimeForm(Model model){
         model.addAttribute("title", "Add Anime");
        return "anime/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddAnimeForm(@RequestParam String animeName){
        anime_alist.add(animeName);

        //Redirect to /anime
        return "redirect:";
    }
}

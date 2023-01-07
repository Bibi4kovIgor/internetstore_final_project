package edu.internetstore.internetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/index")
    public ModelAndView index(ModelMap model) {
        String name = "Ihor";
        model.addAttribute("name", name);
        return new ModelAndView("/index", model);

    }

    @GetMapping("/test")
    public String test(ModelMap model) {
        String name = "Ihor";
    return "index";
//        model.addAttribute("name", name);
//        return new ModelAndView("/index", model);

    }
}

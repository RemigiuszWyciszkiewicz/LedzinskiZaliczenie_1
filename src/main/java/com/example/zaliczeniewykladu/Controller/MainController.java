package com.example.zaliczeniewykladu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {



    @GetMapping("/")
    public String getData(Model model)
    {
        return null;
    }




}

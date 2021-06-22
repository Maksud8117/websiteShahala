package com.website.shalala;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index() { return "index"; }

    @RequestMapping("/article")
    public String article() { return "article";}
}

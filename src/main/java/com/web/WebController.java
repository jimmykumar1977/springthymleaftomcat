package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String one(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        return "hello";
    }
	
	
	@RequestMapping(value = "/world", method = RequestMethod.GET)
    public String two(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        return "next";
    }
}

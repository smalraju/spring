package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processFormUpperCase")
    public String changeName(HttpServletRequest request, Model model){
        String name=request.getParameter("studentName");
        name=name.toUpperCase(Locale.ROOT);
        String result="Modified name : " + name;
        model.addAttribute("message",result);
        return "helloworld";
    }

    @RequestMapping("/processFormUpperCase2")
    public String changeName(@RequestParam("studentName") String name, Model model){

        name=name.toUpperCase(Locale.ROOT);
        String result="Modified name version 2 : " + name;
        model.addAttribute("message",result);
        return "helloworld";
    }
}

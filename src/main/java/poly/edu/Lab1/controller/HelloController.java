package poly.edu.Lab1.controller;

import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import  org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/poly/hello")
    public String hello(){
        return "hello";
    }

//    @GetMapping("/hello")
//    public String hello(Model model){
//        model.addAttribute("message", "xin chào spring ????");
//        return "hello";
//    }
}

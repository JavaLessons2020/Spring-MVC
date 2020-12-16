package org.itstep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/profile/")
public class WebController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)//value = запрос
    public String helloSpring(){
        return "hello";//переходим на страницу index.jsp
    }

    @GetMapping("/get")
    public String getMethod(@RequestParam(value = "email", required = false,
            defaultValue = "46program@gmail.com")String email,
                            Map<String, Object>map, Model model){
        map.put("name", "Ivan");
        model.addAttribute("age", 25);
        model.addAttribute("mail", email);
        return "get";
    }

    @GetMapping("/get/{email}")
    public String getEmail(@PathVariable("email")String email,
                            Map<String, Object>map, Model model){
        map.put("name", "Ivan");
        model.addAttribute("age", 25);
        model.addAttribute("mail", email);
        return "get";
    }
}

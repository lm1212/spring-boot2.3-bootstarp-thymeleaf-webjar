package com.xt.monior.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
//@RequestMapping("sensor")
public class SensorController {

//    @GetMapping()
//    public String hello() {
//        return "hello";
//
//    }

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("name", "appName");

        return "hello";
    }

//    @RequestMapping("error")
//    @ResponseBody
//    public String error(){
//        return "error";
//    }
}

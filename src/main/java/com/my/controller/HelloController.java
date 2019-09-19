package com.my.controller;

import com.my.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    /**
     * params 是对参数的限定
     *
     * @param id
     * @param name
     * @return
     */
    @RequestMapping(value = "test", method = RequestMethod.GET, params = {"id=1","name=jiangying"})
    public String test(@RequestParam("id") long id, @RequestParam("name") String name){
        System.out.println(id);
        System.out.println(name);
        return "test";
    }

    @RequestMapping(value = "index/{id}/{name}")
    public String index(@PathVariable("id") long id, @PathVariable("name") String name){
        System.out.println(id);
        System.out.println(name);
        return "index";
    }

    @RequestMapping(value = "cookie")
    public String index2(@CookieValue("JSESSIONID") String sessionId){
        System.out.println(sessionId);
        return "index";
    }

    @RequestMapping(value = "addUser")
    public String addUser(User user){
        System.out.println(user);
        return "index";
    }

    @RequestMapping(value = "forward")
    public String forward(){
        return "forward:/test.jsp";
    }

    @RequestMapping(value = "redirect")
    public String redirect(){
        return "redirect:/test.jsp";
    }

}

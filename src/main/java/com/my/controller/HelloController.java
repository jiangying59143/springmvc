package com.my.controller;

import com.my.domain.User;
import com.my.domain.UserList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

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

    @RequestMapping("/int")
    @ResponseBody
    public String intTest(@RequestParam("id") int num){
        return "num:"+num;
    }

    @RequestMapping("/int1")
    @ResponseBody
    public String intTest1(int num){
        return "num:"+num;
    }

    @RequestMapping("/integer")
    @ResponseBody
    public String integerTest(Integer num){
        return "num:"+num;
    }

    @RequestMapping("/array")
    @ResponseBody
    public String arrayTest(String[] name){
        for (String str:name){
            System.out.println(str);
        }
        return Arrays.asList(name).toString();
    }

    @RequestMapping("/list")
    public ModelAndView listTest(UserList userList){
        System.out.println(userList);
        return new ModelAndView("show", "userList",  userList);
    }

    @RequestMapping("/json")
    @ResponseBody
    public Object json(@RequestBody User user){
        System.out.println(user);
        return user;
    }

}

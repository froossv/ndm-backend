package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import tables.User;
import tables.UserRepository;

@Controller

/*@RequestMapping("/")
public class DemoController {

    @ResponseBody
    @RequestMapping(method = GET, produces = "application/json")
    public String demo() {
        return "{\"hello\":\"world\"}";
    }
}
*/

@RequestMapping("/signup/")
public class DemoController{

    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @RequestMapping(method = POST, produces = "application/json")
    public ResponseEntity<?> addNewUser(@RequestParam("username") String name, @RequestParam("password") String password, @RequestParam("ph") String phone){
        User U = new User(name,password,phone);
        userRepository.save(U);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}

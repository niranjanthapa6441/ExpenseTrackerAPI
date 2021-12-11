package com.Customer.LoginAndRegistration.CustomerLoginAndRegistration.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

   /*@PostMapping("/register")
    public ResponseEntity<Map<String,String>> registerUser(@RequestBody Map<String,Object> userMap){
        Map<String,String> map = new HashMap<>();
        map.put("message","registered successfully");
        map.put("status","200");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }*/
    @GetMapping("/all")
    public Iterable<User> findAllUser(){
        return  userService.findAllUser();
    }
}

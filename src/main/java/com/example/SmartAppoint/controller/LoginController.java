package com.example.SmartAppoint.controller;


import com.example.SmartAppoint.model.RegisterDTO;
import com.example.SmartAppoint.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/login")
    public String login(@RequestParam String userId,@RequestParam String password){
        RegisterDTO registerDTO=loginRepository.findByUserIdAndPassword(userId,password);
        if(registerDTO!=null){
            return "Success!";
        }else{
            return "failure";
        }
    }
}

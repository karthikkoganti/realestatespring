package com.spring.RealEstate.controller;

import com.spring.RealEstate.Service.RegisterService;
import com.spring.RealEstate.model.Property;
import com.spring.RealEstate.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @CrossOrigin(origins = "*")
    @PostMapping("/user/register")
    public Register register(@RequestBody Register register) {
        return registerService.Register(register);

    }
}
	
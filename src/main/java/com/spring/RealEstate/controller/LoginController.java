package com.spring.RealEstate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.RealEstate.Repository.LoginRepository;
import com.spring.RealEstate.model.UserRequest;
import com.spring.RealEstate.model.Register;

import javax.validation.Valid;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/auth")
public class LoginController {
    private final PasswordEncoder passwordEncoder;
    ResponseObject<String> responseObject = null;
    @Autowired
    LoginRepository loginRepository;
    public LoginController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/user/login")
    public Object updatePasswordBankAdmin(@Valid @RequestBody UserRequest vr) {
        Register ad = loginRepository.getUserLogin(vr.getUsername());
        if (ad == null) {
            return responseObject = new ResponseObject<>(404, "ERROR");
        }
        String db_pw = ad.getPassword();
        Boolean if_pw_matched = passwordEncoder.matches(vr.getPassword(), db_pw); ///////// ENCODING STRING PASSWORD
        String pw = "";

        if (if_pw_matched) {
            pw = db_pw;

        }
        Register llist1 = loginRepository.findByUserNameAndPassword(vr.getUsername(), pw);
        System.out.println("LLSIT 1 out is as follows" + llist1);
        if (llist1 == null) {
            return responseObject = new ResponseObject<>(404, "ERROR");
        }
        return responseObject = new ResponseObject<>(200, "OK");
    }

}
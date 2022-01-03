package com.spring.RealEstate.Service;

import com.spring.RealEstate.Repository.RegisterRepository;
import com.spring.RealEstate.model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    private final PasswordEncoder passwordEncoder;
    @Autowired
    RegisterRepository registerRepository;
    public RegisterService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }
    public Register Register(Register register) {
        Register register1 = new Register();
        register1.setSlno(register.getSlno());
        register1.setPackages(register.getPackages());
        register1.setEmail(register.getEmail());
        register1.setUsername(register.getUsername());
        register1.setPassword(passwordEncoder.encode(register.getUsername()));
        return registerRepository.save(register1);
    }

}

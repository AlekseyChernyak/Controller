package com.example.demo.service;

import com.example.demo.dao.AccountRepository;
import com.example.demo.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloService {
    @Autowired
    AccountRepository accountRepository;
    public AccountEntity accountEntity (){
        return accountRepository.findByUserId(1);
    }
}

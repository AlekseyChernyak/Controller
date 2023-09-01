package com.example.demo.web;

import com.example.demo.dao.AccountRepository;
import com.example.demo.entity.AccountEntity;
import com.example.demo.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloControler {
    @Autowired
    public HelloService helloService;
    @Autowired
    public AccountRepository accountRepository;

    @GetMapping("/hello")
    public List<AccountEntity> hello (){
        logger.info("jora");
        return accountRepository.findAll();
    }
    @PostMapping("/insert")
    public void insert(@RequestBody AccountDto dto){

        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setUserName(dto.getUsername());
        accountEntity.setPassword(dto.getPassword());
        accountEntity.setEmail(dto.getEmail());
        accountRepository.save(accountEntity);
    }

    Logger logger = LoggerFactory.getLogger(HelloControler.class);

}

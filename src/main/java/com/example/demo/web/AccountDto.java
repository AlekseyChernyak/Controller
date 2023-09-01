package com.example.demo.web;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class AccountDto {
    private String username;
    private String password;
    private String email;
}

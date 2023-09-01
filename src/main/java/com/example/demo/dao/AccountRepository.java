package com.example.demo.dao;

import com.example.demo.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity,Integer> {
   AccountEntity findByUserId(int userId);
}

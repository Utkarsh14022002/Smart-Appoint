package com.example.SmartAppoint.repository;

import com.example.SmartAppoint.model.RegisterDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepository extends MongoRepository <RegisterDTO,String>{
    RegisterDTO findByUserIdAndPassword(String userId,String Password);
}

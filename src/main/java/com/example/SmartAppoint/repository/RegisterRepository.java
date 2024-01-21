package com.example.SmartAppoint.repository;

import com.example.SmartAppoint.model.RegisterDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegisterRepository extends MongoRepository<RegisterDTO,String> {
}

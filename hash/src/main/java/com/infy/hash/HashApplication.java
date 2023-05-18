package com.infy.hash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.hash.service.HashingService;

@SpringBootApplication
public class HashApplication implements CommandLineRunner
{
	@Autowired
	@Qualifier("hashingService1")
	HashingService hashingService1;
	
	@Autowired
	@Qualifier("hashingService2")
	HashingService hashingService2;
	
    public static void main(String[] args) {
    	SpringApplication.run(HashApplication.class, args);
    }
    
    @Override
    public void run(String... args) {
    	hashingService1.generateHash();
    	hashingService2.generateHash();
    }
}

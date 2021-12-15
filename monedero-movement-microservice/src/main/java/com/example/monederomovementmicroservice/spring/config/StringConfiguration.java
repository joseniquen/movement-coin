package com.example.monederomovementmicroservice.spring.config;

import com.example.monederomovementmicroservice.aplication.model.CoinRepository;
import com.example.monederomovementmicroservice.aplication.model.MovementRepository;
import com.example.monederomovementmicroservice.infraestructure.repository.CoinCrudRespository;
import com.example.monederomovementmicroservice.infraestructure.repository.MovementCrudRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StringConfiguration {

    @Bean
    public MovementRepository movementRepository() {
        return new MovementCrudRepository();
    }

    @Bean
    public CoinRepository coinRepository() {
        return new CoinCrudRespository();
    }
}

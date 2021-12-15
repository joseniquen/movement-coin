package com.example.monederomovementmicroservice.infraestructure.repository;

import com.example.monederomovementmicroservice.infraestructure.modelDao.CoinDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface ICoinCrudRespostory extends ReactiveCrudRepository<CoinDao, String> {
    Flux<CoinDao> findAllByDocument(String document);
}

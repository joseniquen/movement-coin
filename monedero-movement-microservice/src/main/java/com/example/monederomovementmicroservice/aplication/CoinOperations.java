package com.example.monederomovementmicroservice.aplication;

import com.example.monederomovementmicroservice.aplication.impl.ResponseService;
import com.example.monederomovementmicroservice.domain.Coin;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CoinOperations {
    public Flux<Coin> list();

    public Mono<Coin> get(String id);

    public Mono<ResponseService> create(Coin coin);

    public Mono<Coin> update(String id, Coin coin);

    public void delete(String id);
}

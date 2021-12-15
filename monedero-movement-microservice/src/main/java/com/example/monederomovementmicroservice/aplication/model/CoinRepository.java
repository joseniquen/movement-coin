package com.example.monederomovementmicroservice.aplication.model;

import com.example.monederomovementmicroservice.domain.Coin;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CoinRepository {

    public Flux<Coin> list();

    public Mono<Coin> get(String id);

    public Mono<Coin> create(Coin d);

    public Mono<Coin> update(String id, Coin d);

    public void delete(String id);
}

package com.example.monederomovementmicroservice.aplication.impl;

import com.example.monederomovementmicroservice.aplication.CoinOperations;
import com.example.monederomovementmicroservice.domain.Coin;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ConsumeService {
    private final CoinOperations operations;

    @KafkaListener
            (topics = "topic-coin", containerFactory = "coinKafkaListenerContainerFactory")
    public void createWallet(Coin coin) {
        Mono<ResponseService> rs = operations.create(coin);
        rs.subscribe(w -> {
            System.out.println(w.getMessage());
        });

    }
}

package com.example.monederomovementmicroservice.infraestructure.repository;

import com.example.monederomovementmicroservice.infraestructure.modelDao.MovementDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface IMovementCrudRepository  extends ReactiveCrudRepository<MovementDao, String> {

    Flux<MovementDao> findAllByProduct(String product);

    Flux<MovementDao> findAllByCustomer(String customer);

    Flux<MovementDao> findAllByCustomerAndProduct(String customer, String product);
}

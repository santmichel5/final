package com.example.restaurantreservation.repository;

import com.restaurant_RESARVA.restaurant_reservatioas.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReservaRepository extends MongoRepository<Reserva, String> {
    List<Reserva> findAll();

    default Reserva save(Reserva reserva) {
        return null;
    }
}

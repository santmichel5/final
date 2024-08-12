package com.example.restaurantreservation.service;

import com.example.restaurantreservation.repository.ReservaRepository;
import com.restaurant_RESARVA.restaurant_reservatioas.Restaurante;
import com.restaurant_RESARVA.restaurant_reservatioas.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public List<Reserva> getAllReservas() {
        return reservaRepository.findAll();
    }

    public Reserva createReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    // Otros métodos
}
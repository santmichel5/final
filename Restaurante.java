package com.restaurant_RESARVA.restaurant_reservatioas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String direccion;

    public void setNombre(String nombre) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(String direcciónPrueba) {
    }
    // Otros atributos
}


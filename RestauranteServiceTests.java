package com.example.restaurantreservation.tests;

import com.restaurant_RESARVA.restaurant_reservatioas.Restaurante;
import com.example.restaurantreservation.service.RestauranteService;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class RestauranteServiceTests {
    @Autowired
    private RestauranteService restauranteService;

    @Test
    public void testCreateRestaurante() {
        Restaurante restaurante = new Restaurante();
        restaurante.setNombre("Restaurante Prueba");
        restaurante.setDireccion("Dirección Prueba");

        Restaurante creado = restauranteService.createRestaurante(restaurante);
        assertNotNull(creado);
    }
}

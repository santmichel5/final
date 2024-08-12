package com.restaurant_RESARVA.restaurant_reservatioas;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Document(collection = "reservas")
@Data
public class Reserva {
    @Id
    private String id;
    private Long restauranteId;
    private String usuario;
    private LocalDateTime fechaHora;

}
package com.inovatea.conexaoautista.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
public class DiarioHumor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate Data;
    private String humor;
    private String observacoes;

    @ManyToOne
    private Usuario usuario;
}

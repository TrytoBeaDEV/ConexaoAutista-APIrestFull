package com.inovatea.conexaoautista.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo;

    
}

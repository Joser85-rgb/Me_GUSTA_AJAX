package com.upiiz.Ejericicio_17.Entities;

import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private int likes;
    private String imagen;

    // Getters y Setters
}

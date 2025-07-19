package com.repliforce.bff.client.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String description;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column
    private Double price;
}

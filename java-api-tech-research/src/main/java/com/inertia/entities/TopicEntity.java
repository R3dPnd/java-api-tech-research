package com.inertia.entities;

import lombok.Data;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "TOPIC")
@Data
public class TopicEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;

    @Column(name = "CREATED_DATE")
    private Date createdDate;

    @Column(name = "UPDATED_DATE")
    private Date updatedDate;
    @Column
    private String description;

    @Column
    private String name;
}

package com.lecture.carrental.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 30, message = "Size is exceeded")
    @NotNull(message = "Please enter the car model")
    @Column(length = 30, nullable = false)
    private String model;

    @NotNull(message = "Please enter the car doors")
    @Column(nullable = false)
    private Integer doors;


    @NotNull(message = "Please enter the car seats")
    @Column(nullable = false)
    private Integer seats;


    @NotNull(message = "Please enter the car luggage")
    @Column(nullable = false)
    private Integer luggage;

    @NotNull(message = "Please enter the car transmission")
    @Column(length = 30, nullable = false)
    private String transmission;




}

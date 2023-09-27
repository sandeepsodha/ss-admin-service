package com.ss.adminservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "bus_routes")
public class BusRoute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sourceCity;

    private String destinationCity;

    private BigDecimal distance;

    private Integer duration;

    private BigDecimal price;

    private LocalDate departureTime;

    private LocalDate arrivalTime;
    private Long busId;

}
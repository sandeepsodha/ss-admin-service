package com.ss.adminservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "bus_operators")
public class BusOperator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long operatorID;
    private String operatorName;
    private String contactInformation;
    private String licenseDetails;

}
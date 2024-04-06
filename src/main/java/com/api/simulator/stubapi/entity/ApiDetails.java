package com.api.simulator.stubapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "api_details")
public class ApiDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private String id;
    private String response;
    private String filter;
    private String userID;
    private String endPoint;
    private String description;
    private String type;

}

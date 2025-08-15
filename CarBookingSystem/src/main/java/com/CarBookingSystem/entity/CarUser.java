package com.CarBookingSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private long phone;

//    @OneToMany(mappedBy = "CarUser",cascade = CascadeType.ALL)
//    private List<Car> carList;

    @OneToMany(mappedBy = "carUser", cascade = CascadeType.ALL) // must match the exact field name in Car entity
    private List<Car> carList;


}

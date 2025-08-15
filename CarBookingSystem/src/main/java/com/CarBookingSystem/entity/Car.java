package com.CarBookingSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.Pattern;


import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Pattern(regexp="^[A-Za-z0-9 ]+$",message = "IT SHOULD NOT CONTAIN ANY SPECIAL SYMBOLS")
    private String carname;

    @Pattern(regexp="^[A-Za-z ]+$", message = "CAR BRAND SHOULD NOT CONTAIN ANY NUMBER AND SPECIAL SYMBOLS")
    private String carbrand;

    @Pattern(
            regexp = "^(Red|Blue|Black|White|Grey|Yellow)$",
            message = "IN OUR STORE WE HAVE ONLY (Red|Blue|Black|White|Grey|Yellow) COLORS"
    )
    private String color;
//    private Date date;

//    @ManyToOne
//    @JoinTable(name = "CarUserId")
//    private CarUser carUser;
@ManyToOne
@JoinColumn(name = "car_user_id")
private CarUser carUser;

}

package com.CarBookingSystem.exceptions;

import com.CarBookingSystem.entity.Car;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLOutput;
import java.util.Optional;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(InvalidInputException.class)
    public ResponseEntity<String> handleInvalidInput(InvalidInputException e){
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity<String> carNotFoundException(CarNotFoundException c){
        System.out.println("Car Not Found Please Create An Car...!!!"+c.getMessage());
        return new ResponseEntity<>(c.getMessage(), HttpStatus.BAD_REQUEST);
    }


}

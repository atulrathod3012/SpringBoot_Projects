package com.CarBookingSystem.controller;

import com.CarBookingSystem.entity.Car;
import com.CarBookingSystem.exceptions.InvalidInputException;
import com.CarBookingSystem.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {


    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public Car save(@RequestBody Car c){
        return service.save(c);
    }

    @GetMapping("/findById")
    public ResponseEntity<Optional<Car>> findById(@RequestParam long id){
        return service.findById(id);
    }

    @PutMapping ("/updateCar")
    public ResponseEntity<String> updateCar(@RequestBody Car c){
        return service.update(c);
    }

    @GetMapping("/carList")
    public ResponseEntity<List<Car>> carList(){
        return service.carList();
    }

    @DeleteMapping ("/deleteById")
    public ResponseEntity<String> deleteById(@RequestParam long id){
        return service.deleteById(id);
    }
}

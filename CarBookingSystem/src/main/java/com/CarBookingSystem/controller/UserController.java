package com.CarBookingSystem.controller;

import com.CarBookingSystem.entity.CarUser;
import com.CarBookingSystem.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/saveUser")
    public CarUser saveUser(@RequestBody CarUser c){
        return userService.saveUser(c);
    }

    @GetMapping("/findById")
    public ResponseEntity<Optional<CarUser>> findById(@RequestParam long id ){
        return userService.findById(id);
    }

    @PutMapping("/updateUser")
    public ResponseEntity<String> updateUser(@RequestBody CarUser c){
        return userService.updateUser(c);
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<List<CarUser>> getAllUser(){
        return userService.getAllUser();
    }

    @DeleteMapping("/deleteUser")
    public ResponseEntity<String> deleteUser(@RequestParam long id){
        return userService.deleteUser(id);
    }

    @PostMapping ("/saveCarUser")
    public CarUser saveCarUser(@RequestBody CarUser cu){
        return userService.saveCarUser(cu);
    }
}

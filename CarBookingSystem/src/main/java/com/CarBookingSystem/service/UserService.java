package com.CarBookingSystem.service;

import com.CarBookingSystem.Dao.CarDao;
import com.CarBookingSystem.Dao.UserDao;
import com.CarBookingSystem.entity.Car;
import com.CarBookingSystem.entity.CarUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserDao udao;

    private CarDao cdao;

    public UserService(UserDao udao, CarDao cdao) {
        this.udao = udao;
        this.cdao = cdao;
    }


    public CarUser saveUser(CarUser c) {
        return udao.saveUser(c);
    }

    public ResponseEntity<Optional<CarUser>> findById(long id) {
        Optional<CarUser> oc = udao.findById(id);
        if(oc.isPresent()){
            return new ResponseEntity<>(oc, HttpStatus.FOUND);
        }else{
            return new ResponseEntity<>(oc, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> updateUser(CarUser c) {
        if(udao.updateUser(c)){
            return new ResponseEntity<>("User Updated Sucessfully", HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>("User Not Found", HttpStatus.NOT_ACCEPTABLE);
        }
    }

    public ResponseEntity<String> deleteUser(long id) {
        if(udao.deleteUser(id)){
            return new ResponseEntity<>("User Successfully Deleted", HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>("Unable To Find User", HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<List<CarUser>> getAllUser() {
        if(udao.getAllUser().isEmpty()){
            return new ResponseEntity<>(udao.getAllUser(), HttpStatus.BAD_REQUEST);
        }else{
            return new ResponseEntity<>(udao.getAllUser(), HttpStatus.FOUND);
        }
    }

    public CarUser saveCarUser(CarUser cu){
        return udao.saveCarUser(cu);
    }
}

package com.CarBookingSystem.service;

import com.CarBookingSystem.Dao.CarDao;
import com.CarBookingSystem.Dao.UserDao;
import com.CarBookingSystem.entity.Car;
import com.CarBookingSystem.exceptions.CarNotFoundException;
import com.CarBookingSystem.exceptions.InvalidInputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private CarDao dao;

    private UserDao userDao;

    public CarService(CarDao dao, UserDao userDao) {
        this.dao = dao;
        this.userDao = userDao;
    }


    public Car save(Car c) {
        if(c.getCarbrand()==null){
            throw new InvalidInputException("Car Brand Not Found");
        } else if (c.getCarname()==null) {
            throw  new InvalidInputException("Name not found");
        }
        return dao.save(c);
    }

    public ResponseEntity<Optional<Car>> findById(long id) {
        Optional<Car> c =dao.findById(id);
        System.out.println(c);
        if(c.isEmpty()){
            return new ResponseEntity<>(c, HttpStatus.NOT_FOUND);
        } else{
            Car cr = c.get();
            return new ResponseEntity<>(c, HttpStatus.FOUND);
        }
    }

    public ResponseEntity<String> update(Car c) {
        if(dao.update(c)){
            return new ResponseEntity<>("Updated Sucessfully..", HttpStatus.ACCEPTED);
        }else{
            return new ResponseEntity<>("ID Not Found", HttpStatus.BAD_REQUEST);
        }

    }
    public ResponseEntity<List<Car>> carList() {
        List<Car> lc = dao.carList();
        if(lc.isEmpty()){
            return new ResponseEntity<>(lc, HttpStatus.NOT_FOUND);
        }
        else{
        //<--BELOW WE USE SORTING LOGIC USING COMPARATOR-->
            return new ResponseEntity<>(lc.stream().sorted((o1, o2) -> o1.getCarname().compareTo(o2.getCarname())).toList(), HttpStatus.FOUND);
        }
    }

    public ResponseEntity<String> deleteById(long id) {
        if(dao.deleteById(id)){
            return new ResponseEntity<>("Sucessfully Deleted", HttpStatus.ACCEPTED);
        }
        else{
            return new ResponseEntity<>("Id Not Found", HttpStatus.NOT_FOUND);
        }

    }
}

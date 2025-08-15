package com.CarBookingSystem.Dao;

import com.CarBookingSystem.entity.Car;
import com.CarBookingSystem.jpaRepo.CarJpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public class CarDao {

    private CarJpaRepository carjpa;

    public CarDao(CarJpaRepository carjpa) {
        this.carjpa = carjpa;
    }

    public Car save(Car c) {
        return carjpa.save(c);
    }

    public Optional<Car> findById(long id) {
        return carjpa.findById(id);
    }

    public Boolean update(Car c) {
       Optional<Car> oc =findById(c.getId());
        System.out.println(c+"Updated Method");
        if(oc.isPresent()){
            Car ca =findById(c.getId()).get();
            ca.setCarname(c.getCarname());
            ca.setCarbrand(c.getCarbrand());
            ca.setColor(c.getColor());
            save(ca);
            return true;
        }else{
            return false;
        }
    }

    public List<Car> carList() {
        return carjpa.findAll();
    }

    public Boolean deleteById(long id) {
        Optional<Car> c = carjpa.findById(id);
        if(c.isPresent()){
            carjpa.delete(c.get());
            return true;
        }else{
            return false;
        }
    }
}

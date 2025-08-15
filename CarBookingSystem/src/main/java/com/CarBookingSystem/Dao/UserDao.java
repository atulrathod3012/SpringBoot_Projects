package com.CarBookingSystem.Dao;

import com.CarBookingSystem.entity.CarUser;
import com.CarBookingSystem.jpaRepo.UserJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserDao {

    private UserJpaRepository ujpa;

    public UserDao(UserJpaRepository ujpa) {
        this.ujpa = ujpa;
    }


    public CarUser saveUser(CarUser c) {
        return ujpa.save(c);
    }

    public Optional<CarUser> findById(long id) {
       Optional<CarUser> oc = ujpa.findById(id);
        if(oc.isPresent()){
            return oc;
        }else{
            return oc;
        }
    }

    public boolean updateUser(CarUser c) {
        Optional<CarUser> oc = findById(c.getId());
        if(oc.isPresent()){
            CarUser cu =oc.get();
            cu.setName(c.getName());
            cu.setPhone(c.getPhone());
            ujpa.save(cu);
            return true;
        }else{
            return false;
        }
    }

    public boolean deleteUser(long id) {
        Optional<CarUser> op = ujpa.findById(id);
        if(op.isPresent()){
            ujpa.delete(op.get());
            return true;
        }else{
            return false;
        }
    }

    public List<CarUser> getAllUser() {
        return ujpa.findAll();
    }

    public CarUser saveCarUser(CarUser cu) {
//        System.out.println(cu.);
       return ujpa.save(cu);
    }
}

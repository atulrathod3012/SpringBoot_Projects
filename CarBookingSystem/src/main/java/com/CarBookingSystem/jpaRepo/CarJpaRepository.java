package com.CarBookingSystem.jpaRepo;

import com.CarBookingSystem.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarJpaRepository extends JpaRepository<Car, Long> {

}

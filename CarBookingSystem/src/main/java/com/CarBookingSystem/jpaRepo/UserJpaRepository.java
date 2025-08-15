package com.CarBookingSystem.jpaRepo;

import com.CarBookingSystem.entity.CarUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<CarUser, Long> {
}

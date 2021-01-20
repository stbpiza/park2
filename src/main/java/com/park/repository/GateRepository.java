package com.park.repository;

import com.park.model.Gate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GateRepository extends JpaRepository<Gate, Integer> {


    @Query(value="SELECT * FROM Gate WHERE car_num = ?1 ORDER BY in_time DESC LIMIT 1", nativeQuery = true)
    Gate check(String car_num);
}

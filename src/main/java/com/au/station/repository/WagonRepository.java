package com.au.station.repository;

import com.au.station.entity.Wagon;
import org.springframework.stereotype.Repository;

@Repository
public interface WagonRepository extends JpaRepository<Wagon, Integer>{
    Wagon getById(Integer id);
}

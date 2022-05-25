package com.au.station.repository;

import com.au.station.entity.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface TrainRepository extends JpaRepository<Train, Integer> {
    Train getById(Integer id);
}

package com.au.station.repository;

import com.au.station.entity.Cargo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository()
public interface CargoRepository {

    @Query("select Cargo from com.au.station.entity.Cargo as Cargo")
    List<Cargo> getAllCargo();

    @Query("select Cargo from com.au.station.entity.Cargo as Cargo " +
            "where Cargo.Netto between :from and :to " +
            "order by Cargo.Netto"
    )
    List<Cargo> getCargoByNettoFromTo(@Param("from") Integer from, @Param("to") Integer to);
}

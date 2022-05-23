package com.au.station.repository;

import com.au.station.entity.Cargo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryRepository {
    @Query("select Category from com.au.station.entity.Category as Category")
    List<Cargo> getAllCategory();

    @Query("select Category from com.au.station.entity.Category as Category " +
            "where CargoName = :name "
    )
    List<Cargo> getCategoryByCargoName(@Param("name") String name);

}

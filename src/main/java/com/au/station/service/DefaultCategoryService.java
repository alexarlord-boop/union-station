package com.au.station.service;

import com.au.station.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("DefaultCategoryService")
public class DefaultCategoryService {

    private final CategoryRepository categoryRepository;
    @Autowired
    public DefaultCategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<String> getAllCargoName() {
        List<String> CargoName = categoryRepository.getCargoName();
        return CargoName;
    }
}

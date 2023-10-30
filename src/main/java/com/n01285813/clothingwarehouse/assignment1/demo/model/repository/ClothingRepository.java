package com.n01285813.clothingwarehouse.assignment1.demo.model.repository;

import com.n01285813.clothingwarehouse.assignment1.demo.model.Clothing;
import com.n01285813.clothingwarehouse.assignment1.demo.model.Clothing.Brand;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface ClothingRepository extends CrudRepository<Clothing, Long> {

    List<Clothing> findClothingByBrandFrom(Brand brandFrom);

    List<Clothing> findByBrandFromAndYearOfCreation(String brandFrom, int yearOfCreation);

}

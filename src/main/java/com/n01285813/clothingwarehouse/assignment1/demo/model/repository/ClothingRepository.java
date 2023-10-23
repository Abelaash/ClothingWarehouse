package com.n01285813.clothingwarehouse.assignment1.demo.model.repository;

import com.n01285813.clothingwarehouse.assignment1.demo.model.Clothing;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ClothingRepository extends CrudRepository<Clothing, Long> {

    List<Clothing> findClothingBy(Clothing clothing);

    List<Clothing> findByNameStartsWithAndCreatedAtBetween(String name, LocalDate startDate, LocalDate endDate);


}

package com.n01285813.clothingwarehouse.assignment1.demo.model.repository;

import com.n01285813.clothingwarehouse.assignment1.demo.model.Clothing;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClothingRepositoryPaginated extends PagingAndSortingRepository<Clothing, Long> {
}

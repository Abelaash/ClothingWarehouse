package com.n01285813.clothingwarehouse.assignment1.demo.model.dto;

import com.n01285813.clothingwarehouse.assignment1.demo.model.Clothing.Brand;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClothesSearchByDateDto {

    private String brandFrom;
    private int yearOfCreation;
}

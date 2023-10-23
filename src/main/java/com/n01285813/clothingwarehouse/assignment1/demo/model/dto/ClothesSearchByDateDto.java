package com.n01285813.clothingwarehouse.assignment1.demo.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClothesSearchByDateDto {

    private String name;
    private String startDate;
    private String endDate;
}

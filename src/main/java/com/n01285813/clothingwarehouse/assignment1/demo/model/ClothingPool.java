package com.n01285813.clothingwarehouse.assignment1.demo.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ClothingPool {
    private List<Clothing> clothes;

    public ClothingPool(){
        this.clothes = new ArrayList<>();
    }

    public void add(Clothing cloth) {
        this.clothes.add(cloth);
    }

}

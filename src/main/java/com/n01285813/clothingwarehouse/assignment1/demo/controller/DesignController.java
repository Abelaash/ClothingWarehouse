package com.n01285813.clothingwarehouse.assignment1.demo.controller;

import com.n01285813.clothingwarehouse.assignment1.demo.model.repository.ClothingRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


import com.n01285813.clothingwarehouse.assignment1.demo.model.Clothing;
import com.n01285813.clothingwarehouse.assignment1.demo.model.ClothingPool;
import com.n01285813.clothingwarehouse.assignment1.demo.model.Clothing.Brand;

import java.util.EnumSet;

@Controller
@Slf4j
@RequestMapping("/design")
@SessionAttributes("ClothingPool")
public class DesignController {
    private Clothing clothing;
@Autowired
private ClothingRepository clothingRepository;
    @GetMapping
    public String design(){
        return "design";
    }

    @ModelAttribute
    public void brands (Model model) {
        var brands = EnumSet.allOf(Brand.class);
            model.addAttribute("brands", brands);
        log.info("Brands converted to string: {}", brands);
    }

    @ModelAttribute(name="clothingPool")
    public ClothingPool clothingPool() {
        return new ClothingPool();
    }

    @ModelAttribute
    public Clothing clothing() {
        return Clothing
                .builder()
                .build();
    }

    @PostMapping
    public String processClothingAddition(@Valid Clothing clothing,
                                          Errors errors,
                                          @ModelAttribute ClothingPool pool) {
        if (errors.hasErrors()) {
            return "design";
        }

        log.info("Processing clothing: {}", clothing);
        clothingRepository.save(clothing);
        return "redirect:/clothinglist";
    }

}
package com.n01285813.clothingwarehouse.assignment1.demo.controller;

import com.n01285813.clothingwarehouse.assignment1.demo.model.dto.ClothesSearchByDateDto;
import com.n01285813.clothingwarehouse.assignment1.demo.model.repository.ClothingRepository;
import com.n01285813.clothingwarehouse.assignment1.demo.model.repository.ClothingRepositoryPaginated;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Controller
@RequestMapping("/clothinglist")
public class ClothingListController {

    private static final int PAGE_SIZE = 5;

    private ClothingRepository clothingRepo;

    private ClothingRepositoryPaginated clothingRepoPaginated;

    public ClothingListController(ClothingRepository clothingRepo,
                                  ClothingRepositoryPaginated clothingRepoPaginated) {

        this.clothingRepo = clothingRepo;
        this.clothingRepoPaginated = clothingRepoPaginated;
    }

    @GetMapping
    public String showClothing(Model model) {
        return "clothinglist";
    }

    @ModelAttribute
    public void clothing(Model model) {
        var clothingPage = clothingRepoPaginated.findAll(PageRequest.of(0, PAGE_SIZE));
        model.addAttribute("clothing", clothingPage);
        model.addAttribute("currentPage", clothingPage.getNumber());
        model.addAttribute("totalPages", clothingPage.getTotalPages());
    }

    @ModelAttribute
    public void clothingByDateDto(Model model) {
        model.addAttribute("clothingByDateDto", new ClothesSearchByDateDto());
    }

    @PostMapping
    public String searchClothingByDate(@ModelAttribute ClothesSearchByDateDto clothingByDateDto, Model model) {
        var dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        model.addAttribute("clothes", clothingRepo.findByNameStartsWithAndCreatedAtBetween(
                clothingByDateDto.getBrand(), clothingByDateDto.getYearOfCreation()));
        return "clothinglist";
    }

    @GetMapping("/switchPage")
    public String switchPage(Model model,
                             @RequestParam("pageToSwitch") Optional<Integer> pageToSwitch) {
        var page = pageToSwitch.orElse(0);
        var totalPages = (int) model.getAttribute("totalPages");
        if (page < 0 || page >= totalPages) {
            return "clothinglist";
        }
        var clothingPage = clothingRepoPaginated.findAll(PageRequest.of(pageToSwitch.orElse(0),
                PAGE_SIZE));
        model.addAttribute("clothes", clothingPage.getContent());
        model.addAttribute("currentPage", clothingPage.getNumber());
        return "clothinglist";
    }
}

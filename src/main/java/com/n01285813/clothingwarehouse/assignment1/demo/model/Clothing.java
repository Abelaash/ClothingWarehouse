package com.n01285813.clothingwarehouse.assignment1.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Clothing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clothingID;
    @NotBlank(message = "The Clothing must have a name")
    private String clothingName;
    @Min(value=2021, message = "The Year of creation must be at least 2021")
    private int yearOfCreation;
    @Min(value=1000, message = "The Price must be minimum of $1000")
    private double price;
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    private Brand brandFrom;

    @Getter
    public enum Brand {
        BALENCIAGA("Balenciaga"), STONE_ISLAND("Stone_Island"), DIOR("Dior");

        private String title;

        private Brand(String title){
            this.title = title;
        }

    }

}

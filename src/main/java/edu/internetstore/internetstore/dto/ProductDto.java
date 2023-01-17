package edu.internetstore.internetstore.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class ProductDto {

    private String id;

    @NonNull private String name;

    private String description;

    private boolean available;

//    @Column(name = "category")
//    private Category category;

    @NonNull private BigDecimal price;
}

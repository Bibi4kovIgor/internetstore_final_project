package edu.internetstore.internetstore.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
@Builder
public class Product {
    @NonNull private long id;
    @NonNull private String name;
    private String description;
    private boolean availability = false;
    private Category category;
    @NonNull private BigDecimal price;
}

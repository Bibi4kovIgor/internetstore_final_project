package edu.internetstore.internetstore.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Builder
public class Supplier {
    @NonNull private long id;
    @NonNull private String name;
    @NonNull private String email;
    @NonNull private List<Product> product;
}

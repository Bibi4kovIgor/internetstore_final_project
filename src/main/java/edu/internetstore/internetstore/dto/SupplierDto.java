package edu.internetstore.internetstore.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
@Builder
public class SupplierDto {

    @NonNull private String id;

    @NonNull private String name;

    @NonNull private String email;

//    @Column(name = "product")
//    @NonNull private List<Product> product;
}

package edu.internetstore.internetstore.entity;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Category {
    @NonNull private Long id;
    @NonNull private String name;
}

package edu.internetstore.internetstore.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.UUID;

@Data
@Builder
public class CategoryDto {

    @NonNull private String id;

    @NonNull private String name;
}

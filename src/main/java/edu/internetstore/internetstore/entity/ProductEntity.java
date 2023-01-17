package edu.internetstore.internetstore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ProductEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(name = "name")
    @NonNull private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "availability")
    private boolean available;

//    @Column(name = "category")
//    private Category category;

    @Column(name = "price")
    @NonNull private BigDecimal price;
}

package edu.internetstore.internetstore.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "categories")
public class CategoriesEntity { // interprets to category_entity
    @Id             // Unique, Primary Key, Not Null
    @GeneratedValue // SERIES -> auto generation of key
    @UuidGenerator
    private UUID id;

    @Column(name = "name")
    @NonNull private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "categories_products",
               joinColumns = @JoinColumn(name = "product_id"),          // relation owner
               inverseJoinColumns = @JoinColumn(name = "category_id"))  // relation that "mappedBy"
    private Set<ProductsEntity> products = new HashSet<>();


}

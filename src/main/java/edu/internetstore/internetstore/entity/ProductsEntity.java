package edu.internetstore.internetstore.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class ProductsEntity { // product_entity
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(name = "name")
    @NonNull private String name;

    @Column(name = "vendor_code")
    @NonNull private String vendorCode;

    @Column(name = "description")
    private String description;

    @Column(name = "availability")
    private boolean available;

    @Column(name = "price")
    @NonNull private BigDecimal price;

    @ManyToMany(fetch = FetchType.LAZY,
                cascade = {CascadeType.PERSIST, CascadeType.MERGE},
                mappedBy = "products")
    private Set<CategoriesEntity> categories = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplier_id")
    private SuppliersEntity supplier;

}
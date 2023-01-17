package edu.internetstore.internetstore.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ClientEntity {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(name = "name")
    @NonNull private String name;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Column(name = "email")
    @NonNull private String email;

//    @Column(name = "password")
//    @NonNull private Base64 password;

}

package edu.internetstore.internetstore.dto;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class ClientDto {
    @NonNull private String id;

    @NonNull private String name;

    private LocalDateTime birthDate;

    @NonNull private String email;

//    @NonNull private Base64 password;

}

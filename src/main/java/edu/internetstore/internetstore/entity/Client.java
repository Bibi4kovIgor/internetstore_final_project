package edu.internetstore.internetstore.entity;


import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.Base64;

@Data
@Builder
public class Client {
    @NonNull private long id;
    @NonNull private String name;
    private LocalDateTime birthDate;
    @NonNull private String email;
    @NonNull private Base64 password;

}

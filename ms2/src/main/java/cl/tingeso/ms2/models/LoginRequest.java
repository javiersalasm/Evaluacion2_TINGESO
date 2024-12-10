package cl.tingeso.ms2.models;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}

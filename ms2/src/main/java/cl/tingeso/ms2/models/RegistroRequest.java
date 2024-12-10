package cl.tingeso.ms2.models;

import cl.tingeso.ms2.entities.Cliente;
import cl.tingeso.ms2.enums.ERol;
import lombok.Data;

@Data
public class RegistroRequest {
    private String email;
    private String password;
    private ERol rol;
    private String nombre;
    private String apellido;
    private String rut;
    private int sueldo;
    private int antiguedadLaboral;
}

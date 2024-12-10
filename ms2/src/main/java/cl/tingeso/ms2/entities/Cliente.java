package cl.tingeso.ms2.entities;

import cl.tingeso.ms2.enums.ERol;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente extends Usuario {

    private String rut;
    private String nombre;
    private String apellido;
    private int sueldo;
    private LocalDate fechaNacimiento;
    private int antiguedadLaboral;

    /*
    public String getPassword() {
        return super.getPassword();
    }*/

}

package cl.tingeso.ms2.entities;

import cl.tingeso.ms2.enums.ERol;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cliente extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String rut;
    private String nombre;
    private String apellido;
    private int sueldo;
    private LocalDate fechaNacimiento;
    private int antiguedadLaboral;
}

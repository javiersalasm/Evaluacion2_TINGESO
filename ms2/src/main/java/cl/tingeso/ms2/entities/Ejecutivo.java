package cl.tingeso.ms2.entities;

import cl.tingeso.ms2.enums.ERol;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ejecutivos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ejecutivo extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

}

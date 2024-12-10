package cl.tingeso.ms2.entities;

import cl.tingeso.ms2.enums.ERol;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ejecutivos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ejecutivo extends Usuario {

}

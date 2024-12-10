package cl.tingeso.ms2.repositories;

import cl.tingeso.ms2.entities.Cliente;
import cl.tingeso.ms2.entities.Ejecutivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjecutivoRepository extends JpaRepository<Ejecutivo, Long> {
    Ejecutivo findByEmail(String email);
}

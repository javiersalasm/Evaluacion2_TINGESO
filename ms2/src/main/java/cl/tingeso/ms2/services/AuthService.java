package cl.tingeso.ms2.services;

import cl.tingeso.ms2.entities.Cliente;
import cl.tingeso.ms2.entities.Ejecutivo;
import cl.tingeso.ms2.entities.Usuario;
import cl.tingeso.ms2.repositories.ClienteRepository;
import cl.tingeso.ms2.repositories.EjecutivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EjecutivoRepository ejecutivoRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Usuario authenticate(String email, String password) {
        Cliente cliente = clienteRepository.findByEmail(email);
        if(cliente != null && passwordEncoder.matches(password, cliente.getPassword())) {
            return cliente;
        }

        // Si no es cliente, busca en ejecutivos
        Ejecutivo ejecutivo = ejecutivoRepository.findByEmail(email);
        if(ejecutivo != null && passwordEncoder.matches(password, ejecutivo.getPassword())) {
            return ejecutivo;
        }

        //Si no se encontró, se lanza excepción
        throw new UsernameNotFoundException("Usuario no encontrado o contraseña inválida");
    }


}

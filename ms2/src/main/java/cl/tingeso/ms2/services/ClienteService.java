package cl.tingeso.ms2.services;

import cl.tingeso.ms2.entities.Cliente;
import cl.tingeso.ms2.repositories.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClienteService {
    private ClienteRepository clienteRepository;

    public ArrayList<Cliente> getClientes() {
        return (ArrayList<Cliente>) clienteRepository.findAll();
    }

    public Cliente crearCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public boolean deleteCliente(Long id) throws Exception {
        try {
            clienteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }



}

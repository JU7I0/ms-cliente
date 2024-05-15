package org.juliobarros.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.juliobarros.model.Cliente;
import org.juliobarros.repository.ClienteRepository;

import java.util.List;

@ApplicationScoped
public class ClienteService {

    @Inject
    ClienteRepository clienteRepository;

    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll().list();
    }

    public void adicionarCliente(Cliente cliente) {
        clienteRepository.persist(cliente);
    }
}

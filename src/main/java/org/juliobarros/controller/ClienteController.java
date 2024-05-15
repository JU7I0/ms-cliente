package org.juliobarros.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.juliobarros.model.Cliente;
import org.juliobarros.service.ClienteService;

import java.util.ArrayList;
import java.util.List;

@Path("/api/cliente")
public class ClienteController {

    @Inject
    ClienteService clienteService;

    @GET
    public List<Cliente> listarTodosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try {
            clientes = clienteService.listarTodosClientes();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return clientes;
    }

    @POST
    @Transactional
    public void adicionarCliente(Cliente cliente) {
        clienteService.adicionarCliente(cliente);
    }
}

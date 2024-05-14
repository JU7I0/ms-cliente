package org.juliobarros.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.juliobarros.model.Cliente;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<Cliente> {
}

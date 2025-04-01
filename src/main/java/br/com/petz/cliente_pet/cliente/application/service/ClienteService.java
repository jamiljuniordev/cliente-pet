package br.com.petz.cliente_pet.cliente.application.service;

import br.com.petz.cliente_pet.cliente.application.api.ClienteRequest;
import br.com.petz.cliente_pet.cliente.application.api.ClienteResponse; // Importação adicionada

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
}

package br.com.petz.cliente_pet.cliente.application.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.petz.cliente_pet.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@RestController
@RequestMapping("/v1/cliente") // Adiciona o path base para todos os endpoints
@Log4j2
@RequiredArgsConstructor
public class ClienteController {
    private final ClienteService clienteService = null;

    @PostMapping
    public ClienteResponse postCliente(@RequestBody ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteController - postCliente");
        ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
        log.info("[finaliza] ClienteController - postCliente");
        return clienteCriado;
    }

    public List<ClienteListResponse> getTodosClientes() {
        log.info("[inicia] ClienteController - getTodosClientes");
        List<ClienteListResponse> clientes = clienteService.buscaTodosClientes();
        log.info("[foinaliza] ClienteController - getTodosClientes");

        return clientes;
    }
}

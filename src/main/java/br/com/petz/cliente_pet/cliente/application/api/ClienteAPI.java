package br.com.petz.cliente_pet.cliente.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.rmi.server.UID;
import java.util.List;
import java.util.UUID;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/cliente")
public interface ClienteAPI {

	// Método POST para criar cliente
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);

	// Método GET para listar clientes (corrigido)
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<ClienteListResponse> getTodosClientes();

	@GetMapping(value = "/{IdCliente}")
	@ResponseStatus(code = HttpStatus.OK)
	List<ClientedetalhadoResponse>getClienteAtravesId(@PathVariable UID IdCliente);
}

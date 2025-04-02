package br.com.petz.cliente_pet.cliente.application.service;

import br.com.petz.cliente_pet.cliente.application.api.ClienteListResponse;
import br.com.petz.cliente_pet.cliente.application.api.ClientedetalhadoResponse;
import org.hibernate.validator.constraints.UUID;
import org.springframework.stereotype.Service;

import br.com.petz.cliente_pet.cliente.application.api.ClienteRequest;
import br.com.petz.cliente_pet.cliente.application.api.ClienteResponse; // Import adicionado
import br.com.petz.cliente_pet.cliente.application.repository.ClienteRepository;
import br.com.petz.cliente_pet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplicationService - criaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplicationService - criaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente)
				// .nome(cliente.getNome())  // descomente e adicione outros campos
				// .email(cliente.getEmail())
				.build();
	}

	@Override
	public List<ClienteListResponse> buscaTodosClientes() {
		log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
		List<Cliente> clientes = clienteRepository.buscaTodosClientes();
		log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
		return ClienteListResponse.converte(clientes);
	}

	@Override
	public ClientedetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
		log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
		log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
		return null;
	}
}

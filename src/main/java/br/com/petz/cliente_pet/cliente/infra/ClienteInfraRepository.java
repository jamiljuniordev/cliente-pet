package br.com.petz.cliente_pet.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.petz.cliente_pet.cliente.application.repository.ClienteRepository;
import br.com.petz.cliente_pet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {
	private final ClienteSpringDataJPARepository clienteSpringDataJPARepository; // Remova a inicialização = null

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		Cliente clienteSalvo = clienteSpringDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteInfraRepository - salva");
		return clienteSalvo;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
		List<Cliente> clientes = clienteSpringDataJPARepository.findAll();
		log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
		return clientes;
	}
}

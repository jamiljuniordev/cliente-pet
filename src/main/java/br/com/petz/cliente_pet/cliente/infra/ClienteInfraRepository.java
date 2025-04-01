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
	private final ClienteSpringDataJPARepository clienteSprintDataJPARepository = null;
	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteRepository - salva");
		clienteSprintDataJPARepository.save(cliente);
		log.info("[finaliza] ClienteRepository - salva");
		return cliente;
	}

	@Override
	public List<Cliente> buscaTodosClientes() {
		log.info("[inicia] ClienteRepository - buscaTodosClientes");
		List<Cliente> todosClientes = clienteSprintDataJPARepository.findAll();
		{
			{
			}
			log.info("[finaliza] ClienteRepository - buscaTodosClientes");
			return todosClientes;
		}
	}
}

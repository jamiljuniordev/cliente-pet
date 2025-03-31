package br.com.petz.cliente_pet.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.petz.cliente_pet.cliente.application.repository.ClienteRepository;
import br.com.petz.cliente_pet.cliente.domain.Cliente;
@Repository
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteRepository - salva");
		log.info("[finaliza] ClienteRepository - salva");
		return cliente;
	}

}

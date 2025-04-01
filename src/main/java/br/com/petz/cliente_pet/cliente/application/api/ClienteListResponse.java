package br.com.petz.cliente_pet.cliente.application.api;
import br.com.petz.cliente_pet.cliente.domain.Cliente;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class ClienteListResponse {
    private UUID idCliente;
    private String nomeCompleto;
    private String cpf;
    private String email;
    private String celular;

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return clientes.stream()
                .map(c -> new ClienteListResponse(c))
                .collect(Collectors.toList());

    }

    private ClienteListResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nomeCompleto = getNomeCompleto();
        this.cpf = getCpf();
        this.email = getEmail();
        this.celular = cliente.getCelular();
    }
}

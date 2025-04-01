package br.com.petz.cliente_pet.cliente.application.api;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ClienteResponse {
    private String idCliente;
    // Adicione outros campos que deseja retornar
    // private String nome;
    // private String email;
    // etc.
}

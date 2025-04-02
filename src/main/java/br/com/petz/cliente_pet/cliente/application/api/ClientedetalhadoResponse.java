package br.com.petz.cliente_pet.cliente.application.api;

import br.com.petz.cliente_pet.cliente.domain.Sexo;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class ClientedetalhadoResponse {
    private String celular;
    private String email;
    private String IdCliente;
    private String cpf;
    private Sexo sexo;
    private String nomeCompleto;
    private LocalDate dataHoraDoCadastro;
    private Boolean aceitaTermos;
}


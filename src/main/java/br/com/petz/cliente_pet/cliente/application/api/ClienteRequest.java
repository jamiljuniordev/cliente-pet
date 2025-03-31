package br.com.petz.cliente_pet.cliente.application.api;

import java.time.LocalDate;
import org.hibernate.validator.constraints.br.CPF;
import br.com.petz.cliente_pet.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value

public class ClienteRequest { private String nomeCompleto;
@NotNull
@Email
private String email;
@NotNull
private String celular;
private String telefone;
private Sexo sexo;
@NotNull
private LocalDate dataNascimento;
private String cpf;
@NotNull
private Boolean aceitaTermos;

}

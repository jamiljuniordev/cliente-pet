package br.com.petz.cliente_pet.cliente.application.api;

import java.time.LocalDate;
import org.hibernate.validator.constraints.br.CPF;
import br.com.petz.cliente_pet.cliente.domain.Sexo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
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
public String getCPF;
public String getCpf;
public @NotBlank String getNomeCompleto() {
	// TODO Auto-generated method stub
	return null;
}
public @NotNull @Email String getEmail() {
	// TODO Auto-generated method stub
	return null;

}
public @NotNull String getCelular() {
	// TODO Auto-generated method stub
	return null;
}
public String getTelefone() {
	// TODO Auto-generated method stub
	return null;
}
public @NotNull LocalDate getDataNascimento() {
	// TODO Auto-generated method stub
	return null;
}
public @NotNull Boolean getAceitaTermos() {
	// TODO Auto-generated method stub
	return null;
}
public @NotNull String getSexo() {
	// TODO Auto-generated method stub
	return null;
}

}

package br.com.petz.cliente_pet.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.petz.cliente_pet.cliente.application.api.ClienteRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Getter
public class Cliente {
	public String getIdCliente;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;  // Tipo corrigido para UUID

	@NotBlank
	private String nomeCompleto;

	@NotNull
	@Email
	private String email;

	@NotNull
	private String celular;

	private String telefone;

	@NotNull
	private String sexo;

	@NotNull
	private LocalDate dataNascimento;

	private String cpf;

	@NotNull
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;

	private LocalDateTime dataHoraDaUltimaAlteracao;

	public Cliente(ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.email = clienteRequest.getEmail();
		this.celular = clienteRequest.getCelular();
		this.telefone = clienteRequest.getTelefone();
		this.sexo = clienteRequest.getSexo().toString(); // Garante o formato correto para enum
		this.dataNascimento = clienteRequest.getDataNascimento();
		this.cpf = clienteRequest.getCpf(); // Corrigido: método invocado corretamente
		this.aceitaTermos = clienteRequest.getAceitaTermos();
		this.dataHoraDoCadastro = LocalDateTime.now();
	}

	// Método getIdCliente() removido pois o @Getter do Lombok já gera isso
}
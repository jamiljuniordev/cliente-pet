package br.com.petz.cliente_pet.cliente.domain;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDate;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import java.time.LocalDateTime;
import java.util.UUID;
import org.hibernate.validator.constraints.br.CPF;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Getter
public class Cliente {
	@Id
    @jakarta.validation.constraints.NotBlank
    private String nomeCompleto;
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
    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;
    private UUID idCliente;

    public Cliente(@NotBlank String nomeCompleto, @NotBlank @Email String email, 
                  @NotBlank String celular, String telefone, Sexo sexo, 
                  @NotNull LocalDate dataNascimento, @CPF String cpf, 
                  @NotNull Boolean aceitaTermos) {
        this.idCliente = UUID.randomUUID();
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.aceitaTermos = aceitaTermos;
        this.dataHoraDoCadastro = LocalDateTime.now();
    }
}
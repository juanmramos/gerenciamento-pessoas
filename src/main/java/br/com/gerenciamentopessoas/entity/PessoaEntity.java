package br.com.gerenciamentopessoas.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pessoa")
public class PessoaEntity {
  private Long id;
  private String nome;
  private String sobrenome;
  private String dataNascimento;
  @Embedded
  private EnderecoEntity endereco;
}

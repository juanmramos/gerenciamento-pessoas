package br.com.gerenciamentopessoas.repository;

import br.com.gerenciamentopessoas.entity.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRespository extends JpaRepository<PessoaEntity, Long> {

}

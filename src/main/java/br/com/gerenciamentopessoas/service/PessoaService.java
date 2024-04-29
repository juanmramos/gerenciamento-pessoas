package br.com.gerenciamentopessoas.service;

import br.com.gerenciamentopessoas.entity.PessoaEntity;
import br.com.gerenciamentopessoas.repository.PessoaRespository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PessoaService {
  private final PessoaRespository pessoaRepository;

  public PessoaEntity save(PessoaEntity pessoa) {
    return pessoaRepository.save(pessoa);
  }

  public List<PessoaEntity> findAll() {
    return pessoaRepository.findAll();
  }

  public PessoaEntity findById(Long id) {
    return pessoaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pessoa não encontrada"));
  }

  public void delete(Long id) {
    pessoaRepository.deleteById(id);
  }

  public PessoaEntity update(Long id, PessoaEntity pessoa) {
    PessoaEntity pessoaEntity = findById(id);
    pessoaEntity.setNome(pessoa.getNome());
    pessoaEntity.setSobrenome(pessoa.getSobrenome());
    pessoaEntity.setDataNascimento(pessoa.getDataNascimento());
    pessoaEntity.setEndereco(pessoa.getEndereco());
    return pessoaRepository.save(pessoaEntity);
  }
}

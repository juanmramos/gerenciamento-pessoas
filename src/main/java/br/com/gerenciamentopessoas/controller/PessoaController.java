package br.com.gerenciamentopessoas.controller;

import br.com.gerenciamentopessoas.converter.PessoaConverter;
import br.com.gerenciamentopessoas.dto.PessoaDto;
import br.com.gerenciamentopessoas.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/api/v1/pessoa")
@Controller
public class PessoaController {
  private final PessoaService pessoaService;
  private final PessoaConverter pessoaConverter;

  @PostMapping
  public void save(PessoaDto dto) {
    pessoaService.save(pessoaConverter.toEntity(dto));
  }

  @GetMapping
  public void findAll() {
    pessoaService.findAll();
  }

  @DeleteMapping
  public void delete(Long id) {
    pessoaService.delete(id);
  }

  @PutMapping
  public void update(PessoaDto dto, Long id) {
    pessoaService.update(id, pessoaConverter.toEntity(dto));
  }

  @GetMapping
  public void findById(Long id) {
    pessoaService.findById(id);
  }
}

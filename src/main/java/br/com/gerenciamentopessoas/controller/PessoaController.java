package br.com.gerenciamentopessoas.controller;

import br.com.gerenciamentopessoas.service.PessoaService;
import lombok.Getter;
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

  @PostMapping
  public void save() {
    pessoaService.save(null);
  }

  @GetMapping
  public void findAll() {
    pessoaService.findAll();
  }

  @DeleteMapping
  public void delete() {
    pessoaService.delete(null);
  }

  @PutMapping
  public void update() {
    pessoaService.update(null, null);
  }

  @GetMapping
  public void findById() {
    pessoaService.findById(null);
  }
}

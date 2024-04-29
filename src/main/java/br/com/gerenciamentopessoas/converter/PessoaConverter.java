package br.com.gerenciamentopessoas.converter;

import br.com.gerenciamentopessoas.dto.PessoaDto;
import br.com.gerenciamentopessoas.entity.PessoaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaConverter {

  public abstract PessoaDto toDto(PessoaEntity entity);

  public abstract PessoaEntity toEntity(PessoaDto dto);

}

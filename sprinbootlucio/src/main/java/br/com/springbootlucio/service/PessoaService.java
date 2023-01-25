package br.com.springbootlucio.service;

import br.com.springbootlucio.domain.Pessoa;
import br.com.springbootlucio.domain.dto.PessoaDTO;

import java.util.List;

public interface PessoaService {

    Pessoa findById(long id);
    List<Pessoa> findAll();
    Pessoa create(PessoaDTO obj);
    Pessoa update(PessoaDTO obj);
    void delete(Long id);
}

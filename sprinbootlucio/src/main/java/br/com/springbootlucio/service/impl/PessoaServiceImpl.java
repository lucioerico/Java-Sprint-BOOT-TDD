package br.com.springbootlucio.service.impl;

import br.com.springbootlucio.domain.Pessoa;
import br.com.springbootlucio.domain.dto.PessoaDTO;
import br.com.springbootlucio.repositories.PessoaRepository;
import br.com.springbootlucio.service.PessoaService;
import br.com.springbootlucio.repositories.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public Pessoa findById(long id) {
        Optional<Pessoa> obj = repository.findById(id);
        return obj.orElseThrow( ()-> new ObjectNotFoundException("Houve um erro ao consultar banco de dados"));
    }

    public List<Pessoa> findAll(){
        return repository.findAll();
    }

    @Override
    public Pessoa create(PessoaDTO obj) {
        return repository.save(mapper.map(obj, Pessoa.class));
    }

    @Override
    public Pessoa update(PessoaDTO obj){
        findById(obj.getId());
        return repository.save(mapper.map(obj, Pessoa.class));
    }

    @Override
    public void delete(Long id) {
        findById(id);
        repository.deleteById(id);
    }


}

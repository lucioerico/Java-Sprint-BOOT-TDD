package br.com.springbootlucio.service.impl;//package br.com.springbootlucio.service.impl;

import br.com.springbootlucio.domain.Pessoa;
import br.com.springbootlucio.domain.dto.PessoaDTO;

import br.com.springbootlucio.repositories.PessoaRepository;
import br.com.springbootlucio.repositories.exceptions.ObjectNotFoundException;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


import java.util.List;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@SpringBootTest
class PessoaServiceImplTest {

    public static final Long ID = Long.valueOf(1);
    public static final String NOME = "Lucio";
    public static final String SOBRENOME = "Moriyama";
    public static final String DATANASCIMENTO = "12/09/1985";



    @InjectMocks
    private PessoaServiceImpl service;

    @Mock
    private PessoaRepository repository;

    @Mock
    private ModelMapper mapper;

    private Pessoa pessoa;
    private PessoaDTO pessoaDTO;


    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }


    @Test
    void QuandoFindByIdRetornaUmUsuario() {

        Pessoa pessoa = new Pessoa(ID, NOME, SOBRENOME, DATANASCIMENTO);
        PessoaDTO pessoaDto = new PessoaDTO(ID, NOME, SOBRENOME, DATANASCIMENTO);

        


        Assert.isTrue(repository.findById(ID).equals(pessoaDto));

    }

    @Test
    void QuandoFindByIdRetornarObjectNotFoundException() {
//        when(Repository.findById(anyLong())).thenThrow(new ObjectNotFoundException(""));
    }

    @Test
    void QuandoCreateCadastraUmaPessoa() {
        Pessoa pessoa = new Pessoa(ID, NOME, SOBRENOME, DATANASCIMENTO);
        PessoaDTO pessoaDto = new PessoaDTO(ID, NOME, SOBRENOME, DATANASCIMENTO);



    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    }


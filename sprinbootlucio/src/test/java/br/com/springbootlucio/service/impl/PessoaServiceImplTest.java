//package br.com.springbootlucio.service.impl;
//
//import br.com.springbootlucio.domain.Pessoa;
//import br.com.springbootlucio.domain.dto.PessoaDTO;
//import br.com.springbootlucio.repositories.PessoaRepository;
//import br.com.springbootlucio.repositories.exceptions.ObjectNotFoundException;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.MockitoAnnotations;
//import org.modelmapper.ModelMapper;
//import org.springframework.boot.test.context.SpringBootTest;
//import java.util.Optional;
//
//import static org.mockito.ArgumentMatchers.anyLong;
//import static org.mockito.Mockito.when;
//
//
//@SpringBootTest
//class PessoaServiceImplTest {
//
//    public static final Long ID = Long.valueOf(1);
//    public static final String NOME = "Lucio";
//    public static final String SOBRENOME = "Moriyama";
//    public static final String DATANASCIMENTO = "12/09/1985";
//    @InjectMocks
//    private PessoaServiceImpl service;
//
//    @Mock
//    private PessoaRepository repository;
//
//    @Mock
//    private ModelMapper mapper;
//
//    private Pessoa pessoa;
//    private PessoaDTO pessoaDTO;
////    private Optional<Pessoa> optionalPessoa;
//
//
//    @BeforeEach
//    void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void QuandoFindByIdRetornaUmUsuario() {
//        when(repository.findById(anyLong())).thenReturn(optionalPessoa);
//
//        Pessoa response = service.findById(ID);
//
//        Assertions.assertNotNull(response);
//        Assertions.assertEquals(Pessoa.class, response.getClass());
//        Assertions.assertEquals(ID, response.getId());
//        Assertions.assertEquals(NOME, response.getNome());
//        Assertions.assertEquals(SOBRENOME, response.getSobrenome());
//        Assertions.assertEquals(DATANASCIMENTO, response.getDatanascimento());
//    }
//
//    @Test
//    void QuandoFindByIdRetornarObjectNotFoundException() {
//        when(Repository.findById(anyLong())).thenThrow(new ObjectNotFoundException(""));
//    }
//
//    @Test
//    void create() {
//    }
//
//    @Test
//    void update() {
//    }
//
//    @Test
//    void delete() {
//    }
//
//    private void startPessoa(){
//        pessoa = new Pessoa(ID, NOME, SOBRENOME, DATANASCIMENTO);
//        pessoaDTO = new PessoaDTO(ID, NOME, SOBRENOME, DATANASCIMENTO);
////        optionalPessoa = Optional.of(new pessoaDTO(ID, NOME, SOBRENOME, DATANASCIMENTO));
//    }
//
//}
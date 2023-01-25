package br.com.springbootlucio.config;

import br.com.springbootlucio.domain.Pessoa;
import br.com.springbootlucio.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("teste")
public class LocalConfig {

    @Autowired
    private PessoaRepository repository;

    @Bean
    public void startDB(){
        Pessoa p1 = new Pessoa(2L, "Jimi", "Hendrix","27/11/1942");
        Pessoa p2 = new Pessoa(1L, "Tim", "Henson","19/11/1993");

        repository.saveAll(List.of(p1, p2));
    }
}

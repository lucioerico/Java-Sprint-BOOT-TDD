package br.com.springbootlucio.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {

    private long id;
    private String nome;
    private String sobrenome;
    private String datanascimento;
}



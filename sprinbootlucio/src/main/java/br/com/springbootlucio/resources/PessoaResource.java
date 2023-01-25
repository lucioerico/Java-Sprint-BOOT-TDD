package br.com.springbootlucio.resources;

import br.com.springbootlucio.domain.Pessoa;
import br.com.springbootlucio.domain.dto.PessoaDTO;
import br.com.springbootlucio.service.PessoaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping(value = "/pessoas")
public class PessoaResource {

    public static final String ID = "/{id}";
    @Autowired
    private ModelMapper mapper;

    @Autowired
    private PessoaService service;
    
    @GetMapping(value=ID)
    public ResponseEntity<PessoaDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(mapper.map(service.findById(id), PessoaDTO.class));
//        return ResponseEntity.ok().body(new Pessoa(1L, "Lucio", "Erico", "12/12/1985"));
    }

    @GetMapping
    public ResponseEntity<List<PessoaDTO>> findAll(){
        List<PessoaDTO> listDTO = service.findAll().stream().map
                (x-> mapper.map(x, PessoaDTO.class)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @PostMapping
    public ResponseEntity<PessoaDTO> create(@RequestBody PessoaDTO obj){
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest().path(ID).buildAndExpand(service.create(obj).getId()).toUri();
        return ResponseEntity.created(uri).build();

    }
    @PutMapping(value=ID)
    public ResponseEntity<PessoaDTO> update(@PathVariable Long id, @RequestBody PessoaDTO obj) {
        obj.setId(id);
        return ResponseEntity.ok().body(mapper.map(service.update(obj), PessoaDTO.class));
    }
    @DeleteMapping(value= ID)
    public ResponseEntity<PessoaDTO> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

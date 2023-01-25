package br.com.springbootlucio.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class StandardError {
    private LocalDateTime timestap;
    private Integer status;
    private String error;
    private String path;

}
    

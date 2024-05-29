package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;

    private LocalDate dataNascimento;

    private String email;

    private String senha;

    @Transient
    private String confirmarSenha;

    private String cpfCnpj;


    public void setId(Long id) {
    }

}


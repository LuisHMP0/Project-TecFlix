package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cartao_id", referencedColumnName = "id")
    private Cartao cartao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    public void setId(Long id) {
    }

    // Getters and Setters
}


package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Cartao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private String codigoSeguranca;
    private String nomeTitular;
    private Date dataValidade;

    @ManyToOne // Fazendo relação com usuario
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    public String getNumero() {
        return numero;
    }
}

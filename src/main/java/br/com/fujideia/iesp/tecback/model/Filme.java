package br.com.fujideia.iesp.tecback.model;

import br.com.fujideia.iesp.tecback.validator.IdadeRange;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String descricao;
    private String genero;
    private Integer duracao;
    private String trailer;

    @IdadeRange(min = 7, max = 23)
    private Integer idade;

    @Transient
    private Integer anoLancamento;


    public boolean getId() {
        return getId();
    }
}

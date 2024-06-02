package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Favorito;
import br.com.fujideia.iesp.tecback.service.FavoritoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/favorito")
public class FavoritoController {

    private FavoritoService service;

    @PostMapping
    public Favorito salvar(@Valid @RequestBody Favorito favorito) {
        return service.salvar(favorito);
    }

    @GetMapping
    public List<Favorito> listarTodos() {
        return service.listarTodos();
    }
}

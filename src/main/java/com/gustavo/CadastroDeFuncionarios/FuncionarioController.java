package com.gustavo.CadastroDeFuncionarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FuncionarioController {
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Primeira mensagem nesta rota";
    }

}

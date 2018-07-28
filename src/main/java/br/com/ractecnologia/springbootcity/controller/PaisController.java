package br.com.ractecnologia.springbootcity.controller;


import br.com.ractecnologia.springbootcity.entity.Pais;
import br.com.ractecnologia.springbootcity.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pais")
public class PaisController {

    @Autowired
    private PaisRepository paisRepository;

    @GetMapping
    public List<Pais> findPais(){
        return paisRepository.findAll();

    }
}

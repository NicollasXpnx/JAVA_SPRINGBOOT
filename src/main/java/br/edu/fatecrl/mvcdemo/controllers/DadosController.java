package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Brasileirao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/brasileirao")
public class DadosController {
    private static final List<Brasileirao> Times = new ArrayList<Brasileirao>();

    public DadosController() {
        Times.add(new Brasileirao("Santos", "Marcos Leonardo", 32, 15));
        Times.add(new Brasileirao("Palmeiras", "Rafael Veiga", 30, 11));
        Times.add(new Brasileirao("Corinthians", "Roger Guedes", 27, 9));
    }

    @GetMapping
    public List<Brasileirao> getTimes() {
        return Times;
    }
}

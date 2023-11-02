package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Brasileirao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/brasileirao")
public class BrasileiraoController {
    private static final List<Brasileirao> times = new ArrayList<>();

    public BrasileiraoController() {
        times.add(new Brasileirao("Santos", "Marcos Leonardo", 32, 15));
        times.add(new Brasileirao("Palmeiras", "Rafael Veiga", 30, 11));
        times.add(new Brasileirao("Corinthians", "Roger Guedes", 27, 9));
    }

    @GetMapping
    public String getTimes(Model model) {
        model.addAttribute("Times", times);
        return "times_brasileirao";
    }
}

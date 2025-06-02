package com.hotel.hotel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.hotel.model.Categoria;
import com.hotel.hotel.model.Partit;
import com.hotel.hotel.repository.CategoriaRepository;
import com.hotel.hotel.repository.EquipRepository;
import com.hotel.hotel.repository.PartitRepository;

@Controller
public class PartitController {

    private final PartitRepository partitRepository;
    
    public PartitController(PartitRepository partitRepository) {
        this.partitRepository = partitRepository;
    }

    @GetMapping("/")
    public String showPaginaPartits(Model model) {
        List<Partit> partits = partitRepository.findAll();
        model.addAttribute("partits", partits);
        return "principal";
    }


    @GetMapping("/Añadir-partir")
    public String showPaginaPerseleccionar(Model model) {
        List<Partit> partits = partitRepository.findAll();
        model.addAttribute("partits", partits);
        return "partits-añadir";
    }
    
    @PostMapping("/Añadir-partir-editar")
    public String showPaginaPerEditar(@RequestParam Long id, Model model) {
        Partit partits = partitRepository.findById(id).orElse(null);

        if (partits == null) {
            return "redirect:/Añadir-partir?error";
        }

        model.addAttribute("partits", partits);
        return "partits-añadir-editar";
    }

    @PostMapping("/Guardar")
    public String GuardarModificacio(@ModelAttribute Partit partits) {
        partits = partitRepository.save("partits");
        return "redirect:/Añadir-partir-editar?exito";
    }
}

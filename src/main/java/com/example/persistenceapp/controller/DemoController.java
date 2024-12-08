package com.example.persistenceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.persistenceapp.model.Persona;
import com.example.persistenceapp.repo.IPersonaRepo;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private IPersonaRepo personaRepo;

    @GetMapping()
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
            Model model) {

        Persona p = new Persona();
        p.setIdPersona(1);
        p.setNombre(name);
        // con este metodo guardamos en la BD
        personaRepo.save(p);

        model.addAttribute("name", name);
        return "greeting";
    }

}

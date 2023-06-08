package com.komik.serverapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.komik.serverapp.models.Komik;
import com.komik.serverapp.services.KomikService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/komik")
@AllArgsConstructor
public class KomikController {
    private KomikService komikService;

    @GetMapping
    public List<Komik> getAll() {
        return komikService.getAll();
    }

    @GetMapping("/{id}")
    public Komik getById(@PathVariable int id) {
        return komikService.getById(id);
    }

    @PostMapping
    public Komik create(@RequestBody Komik komik) {
        return komikService.create(komik);
    }

    @PutMapping("/{id}")
    public Komik update(@PathVariable int id, @RequestBody Komik komik) {
        return komikService.update(id, komik);
    }

    @DeleteMapping("/{id}")
    public Komik delete(@PathVariable int id) {
        return komikService.delete(id);
    }
}

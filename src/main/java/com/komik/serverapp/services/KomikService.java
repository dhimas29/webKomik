package com.komik.serverapp.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.komik.serverapp.models.Komik;
import com.komik.serverapp.repositories.KomikRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class KomikService {
    private KomikRepository komikRepository;

    public List<Komik> getAll() {
        return komikRepository.findAll();
    }

    public Komik getById(int id) {
        return komikRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id not found"));
    }

    public Komik create(Komik komik) {
        return komikRepository.save(komik);
    }

    public Komik update(int id, Komik komik) {
        getById(id);
        komik.setId(id);
        return komikRepository.save(komik);
    }

    public Komik delete(int id) {
        Komik komik = getById(id);
        komikRepository.delete(komik);
        return komik;
    }
}

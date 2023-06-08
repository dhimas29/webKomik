package com.komik.serverapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.komik.serverapp.models.Komik;

@Repository
public interface KomikRepository extends JpaRepository<Komik, Integer> {

}

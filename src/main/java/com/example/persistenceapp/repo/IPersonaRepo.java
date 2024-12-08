package com.example.persistenceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.persistenceapp.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}

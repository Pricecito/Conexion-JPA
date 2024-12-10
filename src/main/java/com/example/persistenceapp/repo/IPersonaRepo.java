package com.example.persistenceapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.persistenceapp.model.Cliente;

@Repository
public interface IPersonaRepo extends JpaRepository<Cliente, Long> {
}

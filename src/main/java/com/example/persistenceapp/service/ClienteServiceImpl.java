package com.example.persistenceapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.persistenceapp.model.Cliente;
import com.example.persistenceapp.repo.IPersonaRepo;

@Primary
@Service("ServiceCrud")
@Lazy
public class ClienteServiceImpl implements IService<Cliente> {
    @Autowired
    private IPersonaRepo repo;

    @Override
    public List<Cliente> getAll() {
        return repo.findAll();
    }

    public Optional<Cliente> getPersonaById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Cliente createPersona(Cliente persona) {
        return repo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        repo.deleteById(id);
    }

}

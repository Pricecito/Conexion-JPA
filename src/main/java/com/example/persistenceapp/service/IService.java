package com.example.persistenceapp.service;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
    List<T> getAll();

    Optional<T> getPersonaById(Long id);

    T createPersona(T persona);

    void deletePersona(Long id);

}

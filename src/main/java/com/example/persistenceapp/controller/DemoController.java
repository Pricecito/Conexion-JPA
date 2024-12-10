package com.example.persistenceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.persistenceapp.model.Cliente;
import com.example.persistenceapp.service.IService;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    @Qualifier("ServiceCliente")
    private IService<Cliente> service;

}

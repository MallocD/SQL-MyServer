package com.nbs.Feign.ProjectFeign.controller;

import com.nbs.Feign.ProjectFeign.agenda.ConsumindoApi;
import com.nbs.Feign.ProjectFeign.agenda.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("agenda")
public class AgendaController {

    @Autowired
    private ConsumindoApi consumindoApi;

    @GetMapping
    public Contato retornaContato(){
        return consumindoApi.retornaContato();
    }
}

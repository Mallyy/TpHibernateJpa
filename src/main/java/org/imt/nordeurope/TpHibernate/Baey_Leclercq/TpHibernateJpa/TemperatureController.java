package org.imt.nordeurope.TpHibernate.Baey_Leclercq.TpHibernateJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class TemperatureController {
    @Autowired
    protected TemperatureRepository repository;

    @GetMapping("/")
    public List<Temperature> list(){
        return repository.findAll();
    }
}

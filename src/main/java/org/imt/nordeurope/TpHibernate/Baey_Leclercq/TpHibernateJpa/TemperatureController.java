package org.imt.nordeurope.TpHibernate.Baey_Leclercq.TpHibernateJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import java.util.List;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {
    @Autowired
    protected TemperatureRepository repository;
    @Autowired
    private EntityManager entityManager;

//    @GetMapping("/")
//    public List<Temperature> list(){
//        return repository.findAll();
//    }
    @GetMapping(path = { "/" }, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Temperature>> temperatureAll() {
        List< Temperature > result = entityManager.createQuery("from Temperature", Temperature.class).getResultList();
        for (Temperature temperature : result) {
            System.out.println("Temperature (" + temperature.getId()
                    + " : " + temperature.getName() + " : " +
                    temperature.getValue());
        }

        return new ResponseEntity<List<Temperature>>(result, HttpStatus.OK);
    }
}

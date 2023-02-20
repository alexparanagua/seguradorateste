package com.teste.seguradora.seguradorateste.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Optional;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.seguradora.seguradorateste.repository.OrcamentoRepository;
import com.teste.seguradora.seguradorateste.entity.CarDrivers;
import com.teste.seguradora.seguradorateste.entity.Cars;
import com.teste.seguradora.seguradorateste.entity.Claims;
import com.teste.seguradora.seguradorateste.entity.Customer;
import com.teste.seguradora.seguradorateste.entity.Drivers;
import com.teste.seguradora.seguradorateste.entity.Insurances;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/insurance")
public class OrcamentoController {
    
    @Autowired
    private OrcamentoRepository repository;

    @PostMapping(value = "/budget")
    public void budget(@RequestBody Insurances insurance) {
       repository.save(insurance);
    }

    @GetMapping(value = "/budget/all")
    public List<Insurances> getBudgetAll() {
        if(repository.findAll().size()==0){
            insertExample();
        }
        return repository.findAll();
    }

    @GetMapping(value = "/budget/{id}")
    public Optional<Insurances> getBudget(@PathVariable Long id) {
        return repository.findById(id);
    }

    @GetMapping(value = "/teste/{id}")
    public String getTeste(@PathVariable Long id) {
        return "OK ="+id;
    }

    @PutMapping(value="/budget") //insert or change
    public Insurances putBudget(@RequestBody Insurances entity) {
         return insertInsurances(entity);
    }

    @DeleteMapping(value = "budget/{id}")
    public void deleteBudget(@PathVariable Long id) {
        repository.deleteById(id);
    }

    private Insurances insertInsurances(Insurances entity){
        Insurances obj = new Insurances();
        obj.setId(entity.getId());
        obj.setActive(entity.isActive());
        obj.setDtCreate(entity.getDtCreate());
        obj.setDtUpdate(entity.getDtUpdate());
        //Car
        obj.setCars(entity.getCars());
        //Customer
        obj.setCustomer(entity.getCustomer());
        repository.save(obj);
        return obj;
    }

    private void insertExample(){
        Insurances obj = new Insurances();
        obj.setActive(true);
        obj.setDtCreate(new java.sql.Timestamp(new Date().getTime()));
        obj.setDtUpdate(new java.sql.Timestamp(new Date().getTime()));
        //Car
        obj.setCars(new Cars());
        obj.getCars().setManufacturer("Teste mit");
        obj.getCars().setModel("aquele modelo");
        obj.getCars().setYear(2015);
        obj.getCars().setValueFipe(new BigDecimal(80000));
        //Customer
        obj.setCustomer(new Customer());
        obj.getCustomer().setName("Alguem da Silva");
        //Driver
        obj.getCustomer().setDriver(new Drivers());
        obj.getCustomer().getDriver().setDocument(33333333333L);
        obj.getCustomer().getDriver().setBirthdate(new Date());
        //CarDrivers
        obj.getCars().setCardrivers(new HashSet<>());
        CarDrivers cd1 = new CarDrivers();
        cd1.setCar(obj.getCars());
        cd1.setDriver(obj.getCustomer().getDriver());
        cd1.setMainDriver(true);
        obj.getCars().getCardrivers().add(cd1);
        CarDrivers cd2 = new CarDrivers();
        cd2.setCar(obj.getCars());
        Drivers dd = new Drivers();
        dd.setDocument(111555L);
        dd.setBirthdate(new Date());
        cd2.setDriver(dd);
        obj.getCars().getCardrivers().add(cd2);
        //Claims
        obj.getCars().setClaims(new HashSet<>());
        Claims cl = new Claims();
        cl.setCar(obj.getCars());
        cl.setDriver(obj.getCustomer().getDriver());
        cl.setDtEvent(new Date());
        obj.getCars().getClaims().add(cl);
        repository.save(obj);
    }


}

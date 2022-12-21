package com.glory.app.rest.Controller;

import com.glory.app.rest.Models.*;
import com.glory.app.rest.Repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class ApiControllers {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private AddresseRepo addresseRepo;
    @Autowired
    private BatteriesRepo batteriesRepo;
    @Autowired
    private BuildingsRepo buildingsRepo;
    @Autowired
    private ColumnsRepo columnsRepo;
    @Autowired
    private CustomersRepo customersRepo;
    @Autowired
    private ElevatorsRepo elevatorsRepo;
    @Autowired
    private InterventionsRepo interventionsRepo;

    @Autowired
//    private AddressesRepo addresseRepo;

    @GetMapping(value = "/")
    public String getPage() {

        return "welcome";
    }

    @GetMapping(value = "/users")
    public List<User> getUsers() {

        return userRepo.findAll();
    }

    @GetMapping(value = "/users/{id}")
    public User getUserByID(@PathVariable long id) {

        return userRepo.findById(id).get();
    }

    @GetMapping(value = "/Addresses")
    public List<Addresses> getAddresses() {
        return addresseRepo.findAll();
    }
//
    @GetMapping(value = "/Addresses/{id}")
    public Addresses getAddressesByID(@PathVariable long id) {
        return addresseRepo.findById(id).get();
    }
//
    @GetMapping(value = "/Batteries")
    public List<Batteries> getBatteries(){
        return batteriesRepo.findAll();
    }

    @GetMapping(value = "/Batteries/{id}")
    public Batteries getBatteriesByID(@PathVariable long id){
        return batteriesRepo.findById(id).get();
    }
//
    @GetMapping(value = "/Batteries/{id}/Addresses")
    public List<Addresses> getAddressesByBatteriesID(@PathVariable long id){
        Batteries batteries = batteriesRepo.findById(id).get();
        return batteries.getAddresses();
    }
//
    @GetMapping(value = "/Buildings")
    public List<Buildings> getBuildings(){
        return buildingsRepo.findAll();
    }

    @GetMapping(value = "/Buildings/{id}")
    public Buildings getBuildingsByID(@PathVariable long id){
        return buildingsRepo.findById(id).get();
    }

    @GetMapping(value = "/Buildings/{id}/Batteries")
    public List<Batteries> getBatteriesByBuildingsID(@PathVariable long id){
        Buildings buildings = buildingsRepo.findById(id).get();
        return buildings.getBatteries();
    }
//
    @GetMapping(value = "/Columns")
    public List<Columns> getColumns(){
        return columnsRepo.findAll();
    }

    @GetMapping(value = "/Columns/{id}")
    public Columns getColumnsByID(@PathVariable long id){
        return columnsRepo.findById(id).get();
    }

    @GetMapping(value = "/Columns/{id}/Batteries")
    public Batteries getBatteriesByColumnsID(@PathVariable long id){
        Columns columns = columnsRepo.findById(id).get();
        return columns.getBatteries();
    }
//
    @GetMapping(value = "/Customers")
    public List<Customers> getCustomers(){
        return customersRepo.findAll();
    }

    @GetMapping(value = "/Customers/{id}")
    public Customers getCustomersByID(@PathVariable long id){
        return customersRepo.findById(id).get();
    }
//
    @GetMapping(value = "/Elevators")
    public List<Elevators> getElevators(){
        return elevatorsRepo.findAll();
    }

    @GetMapping(value = "/Elevators/{id}")
    public Elevators getElevatorsByID(@PathVariable long id){
        return elevatorsRepo.findById(id).get();
    }

    @GetMapping(value = "/Interventions")
    public List<Interventions> getInterventions(){
        return interventionsRepo.findAll();
    }

    @GetMapping(value = "/Interventions/{id}")
    public Interventions getInterventionsByID(@PathVariable long id){
        return interventionsRepo.findById(id).get();
    }

}
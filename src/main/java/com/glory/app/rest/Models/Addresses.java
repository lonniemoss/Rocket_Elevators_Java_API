package com.glory.app.rest.Models;

//import javax.persistence.*;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "Addresses")
@Entity
public class Addresses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String address_type;
    @Column
    private String status;
    @Column
    private String numberAndStreet;
    @Column
    private String suiteOrApartment;
    @Column
    private String city;
    @Column
    private String postal_code;
    @Column
    private String country;
    @Column
    private String notes;
    @Column
    private String created_at;
    @Column
    private String updated_at;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress_type() {
        return address_type;
    }

    public void setEmail(String address_type) {
        this.address_type = address_type;
    }

    public String  getNumberAndStreet() {
        return numberAndStreet;
    }

    public void setNumberAndStreet(String numberAndStreet) {
        this.numberAndStreet = numberAndStreet;
    }

    public String  getSuiteOrApartment() {
        return suiteOrApartment;
    }

    public void setSuiteOrApartment(String suiteOrApartment) {
        this.suiteOrApartment = suiteOrApartment;
    }

    public String  getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String  getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String  getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String  getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String  getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

}
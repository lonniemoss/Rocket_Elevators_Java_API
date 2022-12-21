package com.glory.app.rest.Models;

//import javax.persistence.*;

import jakarta.persistence.*;

@Entity
public class Columns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String types;
    @Column
    private String status;
    @Column
    private String model;
    @Column
    private String numberFloorServed;
    @Column
    private String notes;
    @Column
    private String information;
    @Column
    private String created_at;
    @Column
    private String updated_at;
    @Column
    private int battery_id;


    public long getId()
    {
        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getType() {

        return types;
    }

    public void setTypes(String types) {

        this.types = types;
    }

    public String  getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }

    public String  getNumberFloorServed() {

        return numberFloorServed;
    }

    public void setNumberFloorServed(String numberFloorServed) {

        this.numberFloorServed = numberFloorServed;
    }

    public String  getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInformation() {

        return information;
    }

    public void setInformation(String information) {

        this.information = information;
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


    public Batteries getBatteries() {
        return null;
    }
}
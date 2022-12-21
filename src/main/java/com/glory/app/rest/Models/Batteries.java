

package com.glory.app.rest.Models;

//import javax.persistence.*;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Batteries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String types;
    @Column
    private String status;

    @Column
    private String date_commissioning;
    @Column
    private String date_last_inspection;
    @Column
    private String certificate_of_operations;
    @Column
    private String information;
    @Column
    private String notes;
    @Column
    private String created_at;
    @Column
    private String updated_at;

    public long getId() {
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

    public String  getDate_commissioning() {
        return date_commissioning;
    }

    public void setDate_commissioning(String date_commissioning) {
        this.date_commissioning = date_commissioning;
    }

    public String  getDate_last_inspection() {
        return date_last_inspection;
    }

    public void setDate_last_inspection(String date_last_inspection) {
        this.date_last_inspection = date_last_inspection;
    }

    public String  getCertificate_of_operations() {
        return certificate_of_operations;
    }

    public void setCertificate_of_operations(String certificate_of_operations) {
        this.certificate_of_operations = certificate_of_operations;
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


    public List<Addresses> getAddresses() {
        return null;
    }
}
package com.glory.app.rest.Models;

//import javax.persistence.*;

import jakarta.persistence.*;

@Entity
public class Elevators {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String types;
    @Column
    private String status;
    @Column
    private String serial_number;
    @Column
    private String companyName;
    @Column
    private String model;
    @Column
    private String fullName;
    @Column
    private String email;
    @Column
    private String dateCommissioning;
    @Column
    private String dateLastInspection;
    @Column
    private String certificateOperations;
    @Column
    private String information;
    @Column
    private String notes;
    @Column
    private String created_at;
    @Column
    private String updated_at;
    @Column
    private int column_id;


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

    public String  getSerial_number() {

        return serial_number;
    }

    public void setSerial_number(String serial_number) {

        this.serial_number = serial_number;
    }

    public String  getCompanyName() {

        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String  getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    public String  getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String  getDateCommissioning() {

        return dateCommissioning;
    }

    public void setDateCommissioning(String dateCommissioning) {

        this.dateCommissioning = dateCommissioning;
    }

    public String  getDateLastInspection() {

        return dateLastInspection;
    }

    public void setDateLastInspection(String dateLastInspection) {

        this.dateLastInspection = dateLastInspection;
    }

    public String  getCertificateOperations() {

        return certificateOperations;
    }

    public void setCertificateOperations(String certificateOperations) {

        this.certificateOperations = certificateOperations;
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

    public int getColumn_id() {

        return column_id;
    }

    public void setColumn_id(int column_id) {

        this.column_id = column_id;
    }



}
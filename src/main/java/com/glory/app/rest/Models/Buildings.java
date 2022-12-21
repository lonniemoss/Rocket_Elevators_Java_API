
package com.glory.app.rest.Models;

//import javax.persistence.*;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Buildings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String addressOfBuilding;
    @Column
    private String full_name_building_admin;
    @Column
    private String email_building_admin;
    @Column
    private String phone_building_admin;
    @Column
    private String full_name_technical_authority;
    @Column
    private String email_technical_authority;
    @Column
    private String phone_technical_authority;
    @Column
    private String interventionDateStart;
    @Column
    private String created_at;
    @Column
    private String updated_at;
    @Column
    private String interventionDateEnd;
    @Column
    private int customer_id;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddressOfBuilding() {
        return addressOfBuilding;
    }

    public void setAddressOfBuilding(String addressOfBuilding) {
        this.addressOfBuilding = addressOfBuilding;
    }

    public String  getFull_name_building_admin() {
        return full_name_building_admin;
    }

    public void setFull_name_building_admin(String full_name_building_admin) {
        this.full_name_building_admin = full_name_building_admin;
    }

    public String  getEmail_building_admin() {
        return email_building_admin;
    }

    public void setEmail_building_admin(String email_building_admin) {
        this.email_building_admin = email_building_admin;
    }

    public String  getPhone_building_admin() {
        return phone_building_admin;
    }

    public void setPhone_building_admin(String phone_building_admin) {
        this.phone_building_admin = phone_building_admin;
    }

    public String  getFull_name_technical_authority() {
        return full_name_technical_authority;
    }

    public void setFull_name_technical_authority(String full_name_technical_authority) {
        this.full_name_technical_authority = full_name_technical_authority;
    }

    public String getEmail_technical_authority() {
        return email_technical_authority;
    }

    public void setEmail_technical_authority(String email_technical_authority) {
        this.email_technical_authority = email_technical_authority;
    }

    public String  getPhone_technical_authority() {
        return phone_technical_authority;
    }

    public void setPhone_technical_authority(String phone_technical_authority) {
        this.phone_technical_authority = phone_technical_authority;
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


    public String getInterventionDateStart() {
        return interventionDateStart;
    }

    public void setInterventionDateStart(String interventionDateStart) {
        this.interventionDateStart = interventionDateStart;
    }

    public String getInterventionDateEnd() {
        return interventionDateStart;
    }

    public void setInterventionDateEnd(String interventionDateEnd) {
        this.interventionDateEnd = interventionDateEnd;
    }


    public List<Batteries> getBatteries() {
        return null;
    }
}
package com.glory.app.rest.Models;

//import javax.persistence.*;

import jakarta.persistence.*;

@Entity
public class Interventions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String interventionDateStart;
    @Column
    private String interventionDateEnd;
    @Column
    private String result;
    @Column
    private String report;
    @Column
    private String status;
    @Column
    private int employee_id;
    @Column
    private int building_id;
    @Column
    private int battery_id;
    @Column
    private int column_id;
    @Column
    private int elevator_id;


    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {

        this.result = result;
    }

    public String  getReport()
    {
        return report;
    }

    public void setReport(String report) {

        this.report = report;
    }

    public String getStatus() {

        return status;
    }

    public void setStatus(String status) {

        this.status = status;
    }
    public int getEmployee_id() {

        return employee_id;
    }

    public void setEmployee_id(int employee_id) {

        this.employee_id = employee_id;
    }

    public int getBuilding_id() {

        return building_id;
    }

    public void setBuilding_id(int building_id) {

        this.building_id = building_id;
    }

    public int getBattery_id() {

        return battery_id;
    }

    public void setBattery_id(int battery_id) {

        this.battery_id = battery_id;
    }

    public int getColumn_id() {

        return column_id;
    }

    public void setColumn_id(int column_id) {

        this.column_id = column_id;
    }

    public int getElevator_id() {

        return elevator_id;
    }

    public void setElevator_id(int elevator_id) {

        this.elevator_id = elevator_id;
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



}
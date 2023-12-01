package com.monim.spring_boot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    
    public Long getDepartmentId(){
        return departmentId;
    }

    public void setDepartmentId(Long departmentId){
        this.departmentId = departmentId;
    }

    public String getdepartmentName(){
        return departmentName;
    }

    public void setdepartmentName(String departmentName){
        this.departmentName = departmentName;
    }

    public String getdepartmentAddress(){
        return departmentAddress;
    }

    public void setdepartmentAddress(String departmentAddress){
        this.departmentAddress = departmentAddress;
    }

    public String getdepartmentCode(){
        return departmentCode;
    }

    public void setdepartmentCode(String departmentCode){
        this.departmentCode = departmentCode;
    }
}

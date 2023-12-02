package com.monim.spring_boot.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Negative;
import jakarta.validation.constraints.NegativeOrZero;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "Please Add Department Name") 
    /*@Length(max = 5, min = 1)
    @Size(max = 10, min = 0)
    @Email
    @Positive
    @Negative
    @PositiveOrZero
    @NegativeOrZero
    @Future
    @FutureOrPresent
    @Past
    @PastOrPresent */
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

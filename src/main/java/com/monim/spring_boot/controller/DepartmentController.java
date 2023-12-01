package com.monim.spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monim.spring_boot.entity.Department;
import com.monim.spring_boot.service.DepartmentService;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }
}
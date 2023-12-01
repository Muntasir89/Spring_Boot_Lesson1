package com.monim.spring_boot.service;

import java.util.List;

import com.monim.spring_boot.entity.Department;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();
}

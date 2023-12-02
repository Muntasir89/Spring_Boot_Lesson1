package com.monim.spring_boot.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monim.spring_boot.entity.Department;
import com.monim.spring_boot.error.DepartmentNotFoundException;
import com.monim.spring_boot.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException{
        Optional<Department>department = departmentRepository.findById(departmentId);

        if(!department.isPresent()){
            throw new DepartmentNotFoundException("Department not available");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department deptDB = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getdepartmentName()) && !"".equalsIgnoreCase(department.getdepartmentName())){
            deptDB.setdepartmentName(department.getdepartmentName());
        }

        if(Objects.nonNull(department.getdepartmentAddress()) && !"".equalsIgnoreCase(department.getdepartmentAddress())){
            deptDB.setdepartmentAddress(department.getdepartmentAddress());
        }

        if(Objects.nonNull(department.getdepartmentCode()) && !"".equalsIgnoreCase(department.getdepartmentCode())){
            deptDB.setdepartmentCode(department.getdepartmentCode());
        }

        return departmentRepository.save(deptDB);
    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
}

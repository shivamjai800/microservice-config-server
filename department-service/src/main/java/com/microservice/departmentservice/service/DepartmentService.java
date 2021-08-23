package com.microservice.departmentservice.service;

import com.microservice.departmentservice.entity.Department;
import com.microservice.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment method of department Controller");
        return this.departmentRepository.save(department);
    }

    public Department findDepartmentById(Long id) {
        log.info("Inside FindDepartment By Id method of department Service");
        return this.departmentRepository.findById(id).get();

    }
}

package com.RestApiDesign.RestApiDesign.dao;

import com.RestApiDesign.RestApiDesign.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}

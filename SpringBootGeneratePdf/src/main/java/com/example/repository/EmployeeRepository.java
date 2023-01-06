package com.example.repository;

/*
    created by Atiye Mousavi
    Date: 1/6/2023
    Time: 7:05 PM
*/

import com.example.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("FROM Employee e")
    List<Employee> getAllEmployeeData();

}
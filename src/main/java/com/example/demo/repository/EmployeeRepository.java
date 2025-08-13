package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
    //Raw SQL query
    @Query(value = "SELECT * FROM temployee", nativeQuery = true)
    List<Employee> findAllNative();
}

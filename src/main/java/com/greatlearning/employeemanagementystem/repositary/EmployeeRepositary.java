package com.greatlearning.employeemanagementystem.repositary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.employeemanagementystem.entity.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Integer>{

}


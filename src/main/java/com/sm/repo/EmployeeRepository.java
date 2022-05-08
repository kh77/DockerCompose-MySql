package com.sm.repo;

import com.sm.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}





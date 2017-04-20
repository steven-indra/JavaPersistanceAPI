package com.example;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long> {
    public List<Employee> findByLastName(@Param("lastName") String lastName);
//    public List<Employee> findByFirstNameAndLastNameContaining(@Param("contain") String contain);
    public List<Employee> findByLastNameContainingOrderByLastNameAsc(@Param("lastName") String lastName);
}

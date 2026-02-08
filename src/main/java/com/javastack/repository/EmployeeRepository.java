package com.javastack.repository;



import com.javastack.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select to_char(current_date, 'yymm') || lpad(nextval('public.emp_id_seq')\\:\\:text, 6, '0')", nativeQuery = true)
    Long getNextId();


}


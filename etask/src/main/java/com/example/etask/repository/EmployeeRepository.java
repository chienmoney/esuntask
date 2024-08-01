package com.example.etask.repository;

import com.example.etask.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
    // 這裡可以添加自定義查詢方法
}

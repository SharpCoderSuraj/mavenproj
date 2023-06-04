package com.dailystudy.tutorial.repository;

import com.dailystudy.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
    public Department findByDepartmentName(String departmentName);
}
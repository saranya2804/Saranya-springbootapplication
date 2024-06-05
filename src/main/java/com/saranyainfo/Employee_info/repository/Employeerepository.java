package com.saranyainfo.Employee_info.repository;

import com.saranyainfo.Employee_info.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//in jparepository we specify integer because primary key is integer
public interface Employeerepository extends JpaRepository<Employee,Integer> {
}

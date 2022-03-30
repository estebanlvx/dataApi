package com.entreprise.dataApi.repository;

import com.entreprise.dataApi.Model.employee;
import org.apache.tomcat.jni.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<employee, Long> {
}

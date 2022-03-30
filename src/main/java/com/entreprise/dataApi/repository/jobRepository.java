package com.entreprise.dataApi.repository;

import com.entreprise.dataApi.Model.job;
import com.entreprise.dataApi.Model.prod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface jobRepository extends JpaRepository<job, Long> {
    /**
     * Hibernate function to get Address by user id
     * The request like in sql => SELECT * FROM ADDRESSES WHERE USER_ID = 100
     *
     * @param employeeId address owner id
     * @return prod find by owner id
     */
    Optional<job> findByemployeeId(long employeeId);
}

package com.entreprise.dataApi.Service;

import com.entreprise.dataApi.Dto.Model.employeeDto;
import com.entreprise.dataApi.Model.employee;

import java.util.List;
import java.util.Optional;

public interface employeeService {
    /**
     * Get user by id
     *
     * @param employeeId  user identifiant
     * @return User find by id
     */
    Optional<employee> get(long employeeId);

    /**
     * Get list of employee
     *
     * @return list of users
     */
    List<employee> getAll();

    /**
     * Create a new user
     *
     * @param employeeDto to create
     * @return a new user created
     */
    Optional<employee> create(employeeDto employeeDto);

    /**
     * Delete user by id
     *
     * @param employeeId  user identifiant
     * @return delete user by id
     */
    String delete(long employeeId);

    /**
     * Update a existing employee
     *
     * @param existingemployeeToUpdate existing user object
     * @param employeeDtoWithUpdate user dto with informations to update
     * @return User updated
     */
    Optional<employee> update(employee existingemployeeToUpdate,employeeDto employeeDtoWithUpdate);
}

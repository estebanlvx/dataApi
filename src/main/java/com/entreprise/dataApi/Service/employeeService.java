package com.entreprise.dataApi.Service;

import com.entreprise.dataApi.Dto.Model.employeeDto;
import com.entreprise.dataApi.Model.employee;

import java.util.List;
import java.util.Optional;

public interface employeeService {
    /**
     * Get employee by id
     *
     * @param employeeId  employee identifiant
     * @return employee find by id
     */
    Optional<employee> get(long employeeId);

    /**
     * Get list of employee
     *
     * @return list of employee
     */
    List<employee> getAll();

    /**
     * Create a new employee
     *
     * @param employeeDto to create
     * @return a new employee created
     */
    Optional<employee> create(employeeDto employeeDto);

    /**
     * Delete employee by id
     *
     * @param employeeId  employee identifiant
     * @return delete employee by id
     */
    String delete(long employeeId);

    /**
     * Update a existing employee
     *
     * @param existingemployeeToUpdate existing employee object
     * @param employeeDtoWithUpdate employee dto with informations to update
     * @return employee updated
     */
    Optional<employee> update(employee existingemployeeToUpdate,employeeDto employeeDtoWithUpdate);
}

package com.entreprise.dataApi.Service;

import com.entreprise.dataApi.Controller.employeeController;
import com.entreprise.dataApi.Dto.Model.employeeDto;
import com.entreprise.dataApi.Model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entreprise.dataApi.repository.employeeRepository;
import com.entreprise.dataApi.Dto.Mapper.employeeMapper;

import java.util.List;
import java.util.Optional;

@Service("employeeService")
public class employeeServiceImpl implements employeeService{
    @Autowired
    employeeRepository employeeRepository;

    @Override
    public Optional<employee> get(long employeeId) {
        return employeeRepository.findById(employeeId);
    }

    @Override
    public List<employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<employee> create(employeeDto employeeDto) {
        return Optional.of( employeeRepository.save(employeeMapper.toemployee(employeeDto)));
    }

    @Override
    public String delete(long employeeId) {
        employeeRepository.deleteById(employeeId);
        return "user deleted with success";
    }

    @Override
    public Optional<employee> update(employee existingemployeeToUpdate, employeeDto employeeDtoWithUpdate) {
        // -- Update existing user informations
        existingemployeeToUpdate.setName(employeeDtoWithUpdate.getName());
        existingemployeeToUpdate.setEmail(employeeDtoWithUpdate.getEmail());

        // -- Update existing user in DB with new informations
        Optional<employee> updatedemployee = Optional.of(employeeRepository.save(existingemployeeToUpdate));

        return updatedemployee;
    }


}

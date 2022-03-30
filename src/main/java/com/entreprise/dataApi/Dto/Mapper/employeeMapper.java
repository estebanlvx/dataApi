package com.entreprise.dataApi.Dto.Mapper;

import com.entreprise.dataApi.Dto.Model.employeeDto;
import com.entreprise.dataApi.Model.employee;

import java.util.Date;

public class employeeMapper {

    public static employee toemployee(employeeDto employeeDto) {
        employee employee = new employee();
        employee.setName(employeeDto.getName());
        employee.setEmail(employeeDto.getEmail());
        employee.setCreatedAt(new Date());

        return employee;
    }

}

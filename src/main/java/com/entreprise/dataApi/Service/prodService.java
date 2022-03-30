package com.entreprise.dataApi.Service;

import com.entreprise.dataApi.Dto.Model.employeeDto;
import com.entreprise.dataApi.Dto.Model.prodDto;
import com.entreprise.dataApi.Model.employee;
import com.entreprise.dataApi.Model.job;
import com.entreprise.dataApi.Model.prod;

import java.util.List;
import java.util.Optional;

public interface prodService {
    Optional<prod> get(long prodId);
    List<prod> getAll();
    Optional<prod> create(boolean prodBool, employee prodOwner);
    Optional<prod> getByOwnerId(long addressOwnerId);


    Optional<prod> create(prodDto prodDto);

    String delete(long prodId);

    Optional<prod> update(prod existingprodToUpdate, prodDto prodDtoWithUpdate);
}

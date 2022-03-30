package com.entreprise.dataApi.Service;

import com.entreprise.dataApi.Model.employee;
import com.entreprise.dataApi.Model.prod;

import java.util.List;
import java.util.Optional;

public interface prodService {
    Optional<prod> get(long prodId);
    List<prod> getAll();
    Optional<prod> create(boolean prodBool, employee prodOwner);
    Optional<prod> getByOwnerId(long addressOwnerId);
}

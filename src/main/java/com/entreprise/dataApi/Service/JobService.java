package com.entreprise.dataApi.Service;

import com.entreprise.dataApi.Model.employee;
import com.entreprise.dataApi.Model.job;
import com.entreprise.dataApi.Model.prod;

import java.util.List;
import java.util.Optional;

public interface JobService {
    Optional<job> get(long JobId);
    List<job> getAll();
    Optional<job> create(String name, employee jobOwner);
    Optional<job> getByOwnerId(long addressOwnerId);
}

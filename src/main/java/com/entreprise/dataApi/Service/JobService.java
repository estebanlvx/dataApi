package com.entreprise.dataApi.Service;

import com.entreprise.dataApi.Dto.Model.employeeDto;
import com.entreprise.dataApi.Dto.Model.jobDto;
import com.entreprise.dataApi.Dto.Model.prodDto;
import com.entreprise.dataApi.Model.employee;
import com.entreprise.dataApi.Model.job;
import com.entreprise.dataApi.Model.prod;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.List;
import java.util.Optional;

public interface JobService {
    Optional<job> get(long JobId);
    List<job> getAll();
    Optional<job> create(String name, employee jobOwner);
    Optional<job> getByOwnerId(long addressOwnerId);


    Optional<job> create(jobDto jobDto);

    String delete(long jobId);

    Optional<job> update(job existingjobToUpdate, jobDto jobDtoWithUpdate);
}

package com.entreprise.dataApi.Service;

import com.entreprise.dataApi.Dto.Mapper.employeeMapper;
import com.entreprise.dataApi.Dto.Model.employeeDto;
import com.entreprise.dataApi.Dto.Model.jobDto;
import com.entreprise.dataApi.Model.employee;
import com.entreprise.dataApi.Model.job;
import com.entreprise.dataApi.repository.jobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


@Service("jobService")
public class jobServiceImpl implements JobService{

    @Autowired
   jobRepository jobRepository;

    @Override
    public Optional<job> get(long jobId) {
        return jobRepository.findById(jobId);
    }

    @Override
    public List<job> getAll() {
        return jobRepository.findAll();
    }

    @Override
    public Optional<job> create(String name, employee jobOwner) {

        Optional<job> jobExistWithOwnerId = getByOwnerId(jobOwner.getId());

        if (jobExistWithOwnerId.isPresent()){
            jobExistWithOwnerId.get().setName(name);

            return Optional.of(jobRepository.save(jobExistWithOwnerId.get()));
        }

        job job = new job();
        job.setName(name);
        job.setemployee(jobOwner);

        return Optional.of(jobRepository.save(job));
    }

    @Override
    public Optional<job> getByOwnerId(long jobOwnerId) {
        return jobRepository.findByemployeeId(jobOwnerId);
    }

    @Override
    public Optional<job> create(jobDto jobDto) {
        return Optional.empty();
    }

    @Override
    public String delete(long jobId) {
        return null;
    }

    @Override
    public Optional<job> update(job existingjobToUpdate, jobDto jobDtoWithUpdate) {
        return Optional.empty();
    }


}

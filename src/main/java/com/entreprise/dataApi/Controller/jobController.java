package com.entreprise.dataApi.Controller;

import com.entreprise.dataApi.Model.employee;
import com.entreprise.dataApi.Model.job;
import com.entreprise.dataApi.repository.jobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.entreprise.dataApi.Service.JobService;

import java.util.List;
import java.util.Optional;

public class jobController implements JobService{

    @Autowired
    com.entreprise.dataApi.repository.jobRepository jobRepository;

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

}

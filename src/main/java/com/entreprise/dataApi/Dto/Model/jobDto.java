package com.entreprise.dataApi.Dto.Model;

public class jobDto {
    String name;
    long jobOwnerId;

    public jobDto(String name, long jobOwnerId) {
        this.name = name;
        this.jobOwnerId = jobOwnerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getjobOwnerId() {
        return jobOwnerId;
    }

    public void setjobOwnerId(long jobOwnerId) {
        this.jobOwnerId = jobOwnerId;
    }
}
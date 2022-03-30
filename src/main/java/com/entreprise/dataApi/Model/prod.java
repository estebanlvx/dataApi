package com.entreprise.dataApi.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "prod")
public class prod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private boolean prodBool;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private employee employee;

    public prod(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isProdBool() {
        return prodBool;
    }

    public void setProdBool(boolean prodBool) {
        this.prodBool = prodBool;
    }

    public employee getemployee() {
        return employee;
    }

    public void setemployee(employee employee) {
        this.employee = employee;
    }
}

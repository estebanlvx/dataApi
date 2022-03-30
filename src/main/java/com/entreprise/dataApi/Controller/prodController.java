package com.entreprise.dataApi.Controller;

import com.entreprise.dataApi.Dto.Model.jobDto;
import com.entreprise.dataApi.Dto.Model.prodDto;
import com.entreprise.dataApi.Model.employee;
import com.entreprise.dataApi.Model.job;
import com.entreprise.dataApi.Model.prod;
import com.entreprise.dataApi.Service.JobService;
import com.entreprise.dataApi.Service.employeeService;
import com.entreprise.dataApi.Service.prodService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/prod")
public class prodController {

    @Resource(name = "prodService")
    private prodService prodService;

    @Resource(name = "employeeService")
    private employeeService employeeService;

    @GetMapping("/{id}")
    public prod get(@PathVariable long id) {
        return prodService.get(id).orElseThrow(() -> new RuntimeException("Address not found : " + id));
    }

    @GetMapping
    public List<prod> getAll() {
        return prodService.getAll();
    }


}

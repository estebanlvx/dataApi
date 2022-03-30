package com.entreprise.dataApi.Controller;

import com.entreprise.dataApi.Dto.Model.employeeDto;
import com.entreprise.dataApi.Model.employee;
import com.entreprise.dataApi.Service.employeeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/employee")
public class employeeController {

    @Resource(name = "employeeService")
    private employeeService employeeService;

    @GetMapping("/{id}") //Key  GET + /users/id
    public employee get(@PathVariable long id) {
        return employeeService.get(id).orElseThrow(() -> new RuntimeException("User not found : " + id));
    }

    @GetMapping //Key GET + /users/
    public List<employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping // Key POST + /users/
    public employee create(final @RequestBody employeeDto employee){
        return employeeService.create(employee).orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

    @PutMapping("/{id}")
    public employee update(@PathVariable long id, final @RequestBody employeeDto employeeDtoWithUpdate) {
        Optional<employee> existingemployeeToUpdate = Optional.ofNullable(employeeService.get(id).orElseThrow(() -> new RuntimeException("User not found : " + id)));

        return employeeService.update(existingemployeeToUpdate.get(), employeeDtoWithUpdate)
                .orElseThrow(() -> new RuntimeException("Something went wrong, please try later"));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id) {
        return employeeService.delete(id);
    }

}

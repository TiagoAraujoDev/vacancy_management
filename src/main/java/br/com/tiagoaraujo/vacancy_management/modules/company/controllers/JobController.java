package br.com.tiagoaraujo.vacancy_management.modules.company.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagoaraujo.vacancy_management.modules.company.entities.JobEntity;
import br.com.tiagoaraujo.vacancy_management.modules.company.useCases.CreateJobUseCase;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    private CreateJobUseCase createJobUseCase;

    @PostMapping("/")
    public ResponseEntity<Object> create(@Valid @RequestBody JobEntity jobEntity) {
        var result = this.createJobUseCase.execute(jobEntity);
        return ResponseEntity.ok().body(result);
    }
}

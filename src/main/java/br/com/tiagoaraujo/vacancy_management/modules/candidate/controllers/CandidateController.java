package br.com.tiagoaraujo.vacancy_management.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiagoaraujo.vacancy_management.modules.candidate.CandidateEntity;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
        var email = candidateEntity.getEmail();
        var username = candidateEntity.getUsername();
        System.out.println(email);
        System.out.println(username);
    }
}

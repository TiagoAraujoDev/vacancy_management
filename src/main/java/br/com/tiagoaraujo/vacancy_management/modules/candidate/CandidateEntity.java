package br.com.tiagoaraujo.vacancy_management.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @Pattern(regexp = "^(?!\\s*$).+", message = "Field [username] shouldn't contain empty spaces!")
    private String username;

    @Length(min = 4, max = 16)
    private String password;

    @Email(message = "The field [email] should contain a valid email!")
    private String email;

    private String description;
    private String curriculum;
}

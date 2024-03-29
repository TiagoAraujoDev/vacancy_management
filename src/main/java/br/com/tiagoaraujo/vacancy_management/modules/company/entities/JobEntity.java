package br.com.tiagoaraujo.vacancy_management.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity(name = "jobs")
@Data
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    private String description;
    
    @NotBlank(message = "This field is requeired")
    private String level;
    
    private String Benefits;

    @ManyToOne()
    @JoinColumn(name = "company_id")
    private CompanyEntity companyEntity;
    
    @Column(name = "company_id", insertable = false, updatable = false)
    private UUID companyId;
    
    @CreationTimestamp
    private LocalDateTime createdAt;
}

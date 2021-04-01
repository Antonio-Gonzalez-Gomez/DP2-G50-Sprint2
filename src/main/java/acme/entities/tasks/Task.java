package acme.entities.tasks;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import acme.entities.roles.Manager;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Task extends DomainEntity {

    protected static final long    serialVersionUID    = 1L;
    
    @NotEmpty
    @Size(max = 80, message = "Max 80 characters")
    protected String title;
    
    @NotBlank
    @Size(max = 500, message = "Max 500 characters")
    protected String description;
    
    
    protected String link;
    
    @NotNull
    @DateTimeFormat(pattern= "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    protected LocalDateTime startDate;
    
    @NotNull
    @DateTimeFormat(pattern= "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    protected LocalDateTime endingDate;
    
    @NotBlank
    protected Double workload;
    
    @NotBlank
    protected Boolean privacy;
    
    @NotBlank
    protected Boolean finished;
    
    @NotNull
    protected Double executionPeriod;
    
 // Derived attributes -----------------------------------------------------


 	public void setExecutionPeriod() {
		this.executionPeriod = (this.endingDate.getYear()*525600-525600 + this.endingDate.getMonthValue()*43200-43200 + 
			this.endingDate.getDayOfMonth()*1440-1440 + this.endingDate.getHour()*60-60 + this.endingDate.getMinute()-1 + 
			this.endingDate.getSecond()/60-0.016) - (this.startDate.getYear()*525600-525600 + 
			this.startDate.getMonthValue()*43200-43200 + this.startDate.getDayOfMonth()*1440-1440 + 
			this.startDate.getHour()*60-60 + this.startDate.getMinute()-1 + this.startDate.getSecond()/60-0.1);
 	}
    
 // Relationships ----------------------------------------------------------


 	@NotNull
 	@Valid
 	@ManyToOne(optional = false)
 	protected Manager manager;
    
    
    
}
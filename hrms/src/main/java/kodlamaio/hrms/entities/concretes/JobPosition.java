package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.Data;


@Entity


@Data


@Table(name="job_positions")

public class JobPosition {

	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;

	
	
public JobPosition() {
	
}



public JobPosition(int id, String jobName) {
	super();
	this.id = id;
	this.jobName = jobName;
}
	
	
}

package kodlamaio.hrms.apicontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionsService;
import kodlamaio.hrms.entities.concretes.JobPosition;

import java.util.List;

@RestController
@RequestMapping("/api/job_positions")
public class JobNamesController {

	private JobPositionsService jobPositionService;
	
	
	@Autowired
	public JobNamesController(JobPositionsService jobPositionService) {
		this.jobPositionService = jobPositionService;
	}




	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		
		return this.jobPositionService.getAll();
		
	}
	
	
}

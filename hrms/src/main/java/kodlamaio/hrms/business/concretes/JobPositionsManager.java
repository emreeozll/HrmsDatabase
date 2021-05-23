package kodlamaio.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionsService;
import kodlamaio.hrms.dataaccess.abstracts.JobPositionsDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionsManager implements JobPositionsService {

	
    private JobPositionsDao jobPositionsDao;
    
 
   
	@Autowired
	public JobPositionsManager(JobPositionsDao jobPositionsDao) {
		this.jobPositionsDao = jobPositionsDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return jobPositionsDao.findAll();
	}

}

package kodlamaio.hrms.dataaccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobPosition;

public interface JobPositionsDao extends JpaRepository<JobPosition, Integer> {

	

}

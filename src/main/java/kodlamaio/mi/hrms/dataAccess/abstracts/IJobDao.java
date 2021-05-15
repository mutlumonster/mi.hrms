package kodlamaio.mi.hrms.dataAccess.abstracts;

import kodlamaio.mi.hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IJobDao extends JpaRepository<Job,Integer> {
}

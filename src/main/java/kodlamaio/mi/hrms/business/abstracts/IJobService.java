package kodlamaio.mi.hrms.business.abstracts;

import kodlamaio.mi.hrms.entities.concretes.Job;
import java.util.List;

public interface IJobService {
    List<Job> getAll();
}

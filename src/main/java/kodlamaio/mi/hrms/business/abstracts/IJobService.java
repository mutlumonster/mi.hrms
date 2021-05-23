package kodlamaio.mi.hrms.business.abstracts;

import kodlamaio.mi.hrms.core.utilities.DataResult;
import kodlamaio.mi.hrms.core.utilities.Result;
import kodlamaio.mi.hrms.entities.concretes.Job;

import java.util.List;

public interface IJobService {
    DataResult<List<Job>> getAll();
    Result add(Job job);
}

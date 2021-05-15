package kodlamaio.mi.hrms.business.concretes;

import kodlamaio.mi.hrms.business.abstracts.IJobService;
import kodlamaio.mi.hrms.dataAccess.abstracts.IJobDao;
import kodlamaio.mi.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements IJobService {


    private IJobDao jobDao;

    @Autowired
    public JobManager(IJobDao jobDao) {
        super();
        this.jobDao = jobDao;
    }

    @Override
    public List<Job> getAll() {
        return this.jobDao.findAll();
    }
}

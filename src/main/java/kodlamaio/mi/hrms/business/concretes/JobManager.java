package kodlamaio.mi.hrms.business.concretes;

import kodlamaio.mi.hrms.business.abstracts.IJobService;
import kodlamaio.mi.hrms.core.utilities.DataResult;
import kodlamaio.mi.hrms.core.utilities.Result;
import kodlamaio.mi.hrms.core.utilities.SuccessDataResult;
import kodlamaio.mi.hrms.core.utilities.SuccessResult;
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
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<List<Job>>(this.jobDao.findAll(), "Data listelendi");
    }

    @Override
    public Result add(Job job) {
        this.jobDao.save(job);
        return new SuccessResult("Basariyla eklendi");
    }
}

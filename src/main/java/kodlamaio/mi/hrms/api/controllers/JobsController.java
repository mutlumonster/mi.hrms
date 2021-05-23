package kodlamaio.mi.hrms.api.controllers;

import kodlamaio.mi.hrms.business.abstracts.IJobService;
import kodlamaio.mi.hrms.core.utilities.DataResult;
import kodlamaio.mi.hrms.core.utilities.Result;
import kodlamaio.mi.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    private IJobService jobService;

    @Autowired
    public JobsController(IJobService jobService) {
        super();
        this.jobService = jobService;
    }

    @GetMapping("/getall")
    public DataResult<List<Job>> getAll() {
        return this.jobService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Job job){
        return this.jobService.add(job);
    }


}

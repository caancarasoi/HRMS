package com.kaankarasoy.HRMS.api.controllers.JobController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaankarasoy.HRMS.business.abstracts.JobCategoryService;
import com.kaankarasoy.HRMS.entities.concrate.Job.JobCategory;
import com.kaankarasoy.HRMS.utilities.results.DataResult;
import com.kaankarasoy.HRMS.utilities.results.SuccessDataResult;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin
public class JobCategoriesController {
	
	private JobCategoryService jobCategoryService;
	
	@Autowired
	public JobCategoriesController(JobCategoryService jobCategoryService) {
		super();
		this.jobCategoryService = jobCategoryService;
	}
 
	
	@GetMapping("/getAll")
	public DataResult<List<JobCategory>> GetAll(){
		return this.jobCategoryService.getAll();
	}
	

}

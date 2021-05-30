package com.kaankarasoy.HRMS.api.controllers.JobController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaankarasoy.HRMS.business.abstracts.JobCategoryService;
import com.kaankarasoy.HRMS.entities.concrate.Job.JobCategory;

@RestController
@RequestMapping("/api/job")
public class JobCategoryController {
	private JobCategoryService _jobCategoryService;
	
	@Autowired
	public JobCategoryController(JobCategoryService jobCategoryService) {
		super();
		this._jobCategoryService = jobCategoryService;
	}
	
	@GetMapping("/getAllJobCategory")
	public List<JobCategory> GetAllJobCategory(){
		return this._jobCategoryService.getAll();
	}
	

}

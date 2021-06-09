package com.kaankarasoy.HRMS.business.abstracts;

import java.util.List;

import com.kaankarasoy.HRMS.entities.concrate.Job.JobCategory;
import com.kaankarasoy.HRMS.utilities.results.DataResult;

public interface JobCategoryService {
	
	 public DataResult<List<JobCategory>> getAll();
	  
}

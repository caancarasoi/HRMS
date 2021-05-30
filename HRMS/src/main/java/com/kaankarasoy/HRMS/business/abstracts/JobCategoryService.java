package com.kaankarasoy.HRMS.business.abstracts;

import java.util.List;

import com.kaankarasoy.HRMS.entities.concrate.Job.JobCategory;

public interface JobCategoryService {
	public List<JobCategory> getAll();
}

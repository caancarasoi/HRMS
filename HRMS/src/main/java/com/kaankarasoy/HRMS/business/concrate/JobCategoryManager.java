package com.kaankarasoy.HRMS.business.concrate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaankarasoy.HRMS.business.abstracts.JobCategoryService;
import com.kaankarasoy.HRMS.dataAccess.abstracts.JobCategoryDao;
import com.kaankarasoy.HRMS.entities.concrate.Job.JobCategory;

@Service
public class JobCategoryManager implements JobCategoryService{
	
	private JobCategoryDao _jobCategoryDao;
	
	@Autowired
	public JobCategoryManager(JobCategoryDao jobCategoryDao) {
		super();
		this._jobCategoryDao = jobCategoryDao;
	}
	
	

	@Override
	public List<JobCategory> getAll() {
		// TODO Auto-generated method stub
		return this._jobCategoryDao.findAll();
	}

}

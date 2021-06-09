package com.kaankarasoy.HRMS.business.concrate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaankarasoy.HRMS.business.abstracts.JobCategoryService;
import com.kaankarasoy.HRMS.dataAccess.abstracts.JobCategoryDao;
import com.kaankarasoy.HRMS.entities.concrate.Job.JobCategory;
import com.kaankarasoy.HRMS.utilities.results.DataResult;
import com.kaankarasoy.HRMS.utilities.results.SuccessDataResult;

@Service
public class JobCategoryManager implements JobCategoryService{
	
	private JobCategoryDao _jobCategoryDao;
	
	@Autowired
	public JobCategoryManager(JobCategoryDao jobCategoryDao) {
		super();
		this._jobCategoryDao = jobCategoryDao;
	}
	
	

	@Override
	public DataResult<List<JobCategory> > getAll() {
		
		return new SuccessDataResult<List<JobCategory>>(this._jobCategoryDao.findAll(),"Data Listed..."); 
	}

}

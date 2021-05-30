package com.kaankarasoy.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaankarasoy.HRMS.entities.concrate.Job.JobCategory;

public interface JobCategoryDao extends JpaRepository<JobCategory, Integer>{

}

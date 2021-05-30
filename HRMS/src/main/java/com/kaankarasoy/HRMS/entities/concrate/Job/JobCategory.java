package com.kaankarasoy.HRMS.entities.concrate.Job;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_category")
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "job_category" })
public class JobCategory {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_category_id")
	private int job_category_id;
	
	@Column(name="job_category_name")
	private String job_category_name;
	
	@Column(name="job_category_is_active")
	private Boolean job_category_is_active;
	
	@Column(name="job_category_sub_category")
	private int job_category_sub_category;


}

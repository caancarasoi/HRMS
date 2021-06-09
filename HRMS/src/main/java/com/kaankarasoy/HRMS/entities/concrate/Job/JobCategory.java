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
@Table(name = "job_categories")
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
	
	public JobCategory() {}
	public JobCategory(int job_category_id, String job_category_name, Boolean job_category_is_active,
			int job_category_sub_category) {
		super();
		this.job_category_id = job_category_id;
		this.job_category_name = job_category_name;
		this.job_category_is_active = job_category_is_active;
		this.job_category_sub_category = job_category_sub_category;
	}
 

	public int getJob_category_id() {
		return job_category_id;
	}

	public void setJob_category_id(int job_category_id) {
		this.job_category_id = job_category_id;
	}

	public String getJob_category_name() {
		return job_category_name;
	}

	public void setJob_category_name(String job_category_name) {
		this.job_category_name = job_category_name;
	}

	public Boolean getJob_category_is_active() {
		return job_category_is_active;
	}

	public void setJob_category_is_active(Boolean job_category_is_active) {
		this.job_category_is_active = job_category_is_active;
	}

	public int getJob_category_sub_category() {
		return job_category_sub_category;
	}

	public void setJob_category_sub_category(int job_category_sub_category) {
		this.job_category_sub_category = job_category_sub_category;
	}

	


}

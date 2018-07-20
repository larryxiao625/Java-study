package com.imooc.model;

public class Job {
	private String jobName;
	private int jobNum;
	public Job(String jobname) {
		this.setJobName(jobname);
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public int getJobNum() {
		return jobNum;
	}
	public void setJobNum(int jobNum) {
		this.jobNum = jobNum;
	}
	
}

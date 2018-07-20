package com.imooc.model;

public class Worker {
	private String workerName;
	private int workerAge;
	private String workerNo;
	private String workerSex;
	private Department myDepartment;
	private Job myJob;
	/**
	 * 
	 * @param workername姓名
	 * @param workerage年龄
	 * @param workerno编号
	 * @param workersex性别
	 * @param myJob职位
	 */
	public Worker(String workername,int workerage,String workerno,String workersex,Job myJob) {
		this.setWorkerName(workername);
		this.setWorkerAge(workerage);
		this.setWorkerNo(workerno);
		this.setWorkerSex(workersex);
		this.setMyJob(myJob);
	}
	public Job getMyJob() {
		return myJob;
	}
	public void setMyJob(Job myJob) {
		this.myJob = myJob;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public int getWorkerAge() {
		return workerAge;
	}
	/**
	 * 检测传入是否合法，若不合法则强制设置年龄为18
	 * @param workerAge
	 */
	public void setWorkerAge(int workerAge) {
		if(workerAge>=18&workerAge<=65) {
		this.workerAge = workerAge;
		}else {
			this.workerAge=18;
		}
	}
	public String getWorkerNo() {
		return workerNo;
	}
	public void setWorkerNo(String workerNo) {
		this.workerNo = workerNo;
	}
	public String getWorkerSex() {
		return workerSex;
	}
	/**
	 * 判断传入值是否合法，若不合法则强制设置为男
	 * @param workerSex性别
	 */
	public void setWorkerSex(String workerSex) {
		if(workerSex!="男"|workerSex!="女") {
			this.workerSex="男";
		}else {
		this.workerSex = workerSex;
		}
	}
	/**
	 * 
	 * @return获取职位信息
	 */
	public Department getMyDepartment() {
		if(this.myDepartment==null) {
			this.myDepartment=new Department();
		}
		return myDepartment;
	}
	/**
	 * 传入职位信息
	 * @param myDepartment职位信息
	 */
	public void setMyDepartment(Department myDepartment) {
		this.myDepartment = myDepartment;
	}
	public String info() {
		String str="姓名:"+this.getWorkerName()+"\n工号:"+this.getWorkerNo()+"\n性别:"+this.getWorkerSex()+"\n年龄:"+this.getWorkerAge()+"\n职务:"+this.getMyDepartment().getDepartmentName()+this.getMyJob().getJobName();
		return str;
	}

}

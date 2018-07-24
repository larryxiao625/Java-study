package com.imooc.model;

public class Department {
		/**
		 * 私有属性：部门名字，部门编号
		 */
		private String departmentName;
		private int departmentNo;
		private Worker[] myWorker;
		private int WorkerNum;
		public Department(String departmentname) {
			this.setDepartmentName(departmentname);
		}
		public Department() {
			
		}

		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		public int getDepartmentNo() {
			return departmentNo;
		}
		public void setDepartmentNo(int departmentNo) {
			this.departmentNo = departmentNo;
		}
		/**
		 * 若数组未初始化，则强制初始化为长度为200的数组
		 * @return
		 */
		public Worker[] getMyWorker() {
			if(this.myWorker==null) {
				this.myWorker=new Worker[200];
			}
			return myWorker;
		}
		public void setMyWorker(Worker[] myWorker) {
			this.myWorker = myWorker;
		}
		public int getWorkerNum() {
			return WorkerNum;
		}
		public void setWorkerNum(int workerNum) {
			WorkerNum = workerNum;
		}
		/**
		 * 
		 * @param wor1传入个人信息
		 */
		public void addWorker(Worker wor) {
			for(int i=0;i<this.getMyWorker().length;i++)
			if(this.getMyWorker()[i]==null) {
				this.getMyWorker()[i]=wor;;
				wor.setMyDepartment(this);//将职位和人进行双向关联
				this.WorkerNum=i+1;
				return;
			}
		}
		
		

		
}

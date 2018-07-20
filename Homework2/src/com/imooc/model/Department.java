package com.imooc.model;

public class Department {

		private String departmentName;
		private int departmentNo;
		private Worker[] myWorker1;
		private int WorkerNum1;
		private Worker[] myWorker2;
		private int WorkerNum2;
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
		public Worker[] getMyWorker1() {
			if(this.myWorker1==null) {
				this.myWorker1=new Worker[200];
			}
			return myWorker1;
		}
		public void setMyWorker1(Worker[] myWorker1) {
			this.myWorker1 = myWorker1;
		}
		public int getWorkerNum1() {
			return WorkerNum1;
		}
		public void setWorkerNum1(int workerNum1) {
			WorkerNum1 = workerNum1;
		}
		/**
		 * 若数组未初始化，则强制初始化为长度为200的数组
		 * @return
		 */
		public Worker[] getMyWorker2() {
			if(this.myWorker2==null) {
				this.myWorker2=new Worker[200];
			}
			return myWorker2;
		}
		public void setMyWorker2(Worker[] myWorker2) {
			this.myWorker2 = myWorker2;
		}
		public int getWorkerNum2() {
			return WorkerNum2;
		}
		public void setWorkerNum2(int workerNum2) {
			WorkerNum2 = workerNum2;
		}
		/**
		 * 
		 * @param wor1传入个人信息
		 */
		public void addWorker1(Worker wor1) {
			for(int i=0;i<this.getMyWorker1().length;i++)
			if(this.getMyWorker1()[i]==null) {
				this.getMyWorker1()[i]=wor1;;
				wor1.setMyDepartment(this);//将职位和人进行双向关联
				this.WorkerNum1=i+1;
				return;
			}
		}
		
		public void addWorker2(Worker wor2) {
			for(int i=0;i<this.getMyWorker2().length;i++) {
				if(this.getMyWorker2()[i]==null) {
					this.getMyWorker2()[i]=wor2;
					wor2.setMyDepartment(this);//将职位和人进行双向关联
					this.WorkerNum2=i+1;
					return;
					
				}
			}
		}
		

		
}

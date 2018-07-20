package com.imooc.test;

import com.imooc.model.Worker;
import com.imooc.model.Department;
import com.imooc.model.Job;
public class JobTest {

	public static void main(String[] args) {
		Department dep1=new Department("人事部");
		Department dep2=new Department("市场部");
		Job job1=new Job("经理");
		Job job2=new Job("助理");
		Job job3=new Job("职员");
		Worker wor1=new Worker("张铭",29,"S001","男",job1);
		Worker wor2=new Worker("李艾爱",21,"S002","女",job2);
		Worker wor3=new Worker("孙超",29,"S004","男",job3);
		Worker wor4=new Worker("张美美",26,"S005","女",job3);
		Worker wor5=new Worker("蓝迪",37,"S006","男",job1);
		Worker wor6=new Worker("米莉",24,"S007","女",job3);
		dep1.addWorker1(wor1);
		dep1.addWorker1(wor2);
		dep1.addWorker1(wor3);
		dep2.addWorker2(wor4);
		dep2.addWorker2(wor5);
		dep2.addWorker2(wor6);
		System.out.println(wor1.info());
		System.out.println("================");
		System.out.println(wor2.info());
		System.out.println("================");
		System.out.println(wor3.info());
		System.out.println("================");
		System.out.println(wor4.info());
		System.out.println("================");
		System.out.println(wor5.info());
		System.out.println("================");
		System.out.println(wor6.info());
		System.out.println("================");
		System.out.println(dep1.getDepartmentName()+"总共有"+dep1.getWorkerNum1()+"名员工");
		System.out.println(dep2.getDepartmentName()+"总共有"+dep2.getWorkerNum2()+"名员工");


		

	}

}

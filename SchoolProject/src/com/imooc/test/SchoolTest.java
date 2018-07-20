package com.imooc.test;
import com.imooc.model.Student;
import com.imooc.model.Subject;
public class SchoolTest {

	public static void main(String[] args) {
		// 测试Subject
		Subject sub1=new Subject("计算机科学与应用","0001",4);
		System.out.println(sub1.info());
		System.out.println("=================");
		//测试Student
		Student stu1=new Student("张三","s01","男",200,sub1);
		System.out.println(stu1.introduction());
		System.out.println("=================");
		Student stu2=new Student("李四","S02","女",17);
		System.out.println(stu2.introduction("计算机科学与技术",4));
		System.out.println("=================");
		Student stu3=new Student("王五","S03","男",18);
		System.out.println(stu3.introduction(sub1));
		System.out.println("=================");
//		测试指定专业中有多少个学生报名
		sub1.addStudent(stu1);
		sub1.addStudent(stu2);
		sub1.addStudent(stu3);
		System.out.println("报名课程人数："+sub1.getStudentNum());

	}

}

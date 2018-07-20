package com.imooc.model;
/**
 * 
 * @author ray
 *
 */

public class Subject {
	// 成员属性：学科名称，学科编号，学制年限、报名选修的学生信息、报名选修的学生个数
	private String subjectName;
	private String subjectNo;
	private int subjectLife;
	private Student[] myStudent;
	private int studentNum;

	public Subject() {

	}

	// 带参构造实现学科名称、编号、学制年限赋值
	public Subject(String subjectName, String SubjectNo, int subjectLife) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(SubjectNo);
		this.setSubjectLife(subjectLife);
	}
	//带参构造，实现对全部属性的赋值
	public Subject(String subjectName, String SubjectNo, int subjectLife,Student[] myStudent) {
		this.setSubjectName(subjectName);
		this.setSubjectNo(SubjectNo);
		this.setSubjectLife(subjectLife);
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectNo() {
		return subjectNo;
	}

	public void setSubjectNo(String subjectNo) {
		this.subjectNo = subjectNo;
	}

	public int getSubjectLife() {
		return subjectLife;
	}

	public void setSubjectLife(int subjectLife) {
		if (subjectLife <= 0) {
			return;
		} else {
			this.subjectLife = subjectLife;
		}
	}
	/**
	 * 获取选修专业学生信息 如果保存学生信息的数组未初始化，则先初始化长度
	 * @return
	 */
	public Student[] getMyStudent() {
		if(this.myStudent==null)
			this.myStudent=new Student[200];
		return myStudent;
	}

	public void setMyStudent(Student[] myStudent) {
		this.myStudent = myStudent;
	}

		public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

		/**
		 * 
		 * @return专业介绍的相关信息，包括名称，编号，年限
		 */
	public String info() {
		String str = "专业信息如下:\n专业名称" + this.getSubjectName() + "专业编号\n" + this.getSubjectNo() + "专业年限\n"
				+ this.getSubjectLife()+"年";
		return str;
	}
	
	public void addStudent(Student stu) {
		/*
		 * 1、将学生保存到数组中
		 * 2、将学生个数保存到studentNum
		 */
//		int i;
		for(int i=0;i<this.getMyStudent().length;i++) {
			if(this.getMyStudent()[i]==null) {
				this.getMyStudent()[i]=stu;
				stu.setStudentSubject(this);
				this.studentNum=i+1;
				return;
			}
		}
		//2、将学生个数保存到studentNum
//		this.studentNum=i+1;
	}

}

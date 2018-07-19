package com.imooc.model;

public class Student {
	// 成员属性：学号，姓名，性别，年龄
	private String StudentName;
	private String studentNo;
	private String studentSex;
	private int studentAge;
	private Subject studentSubject;// 没有赋值之前对象值为null

	// 无参构造方法
	public Student() {

	}

	// 实现对学号，姓名，性别，年龄的赋值
	public Student(String studentName, String studentNo, String studentSex, int studentAge) {
		super();
		this.setStudentName(studentName);
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);

	}

	// 多参构造方法，实现对全部属性的赋值
	public Student(String studentName, String studentNo, String studentSex, int studentAge, Subject studentSubject) {
		super();
		this.setStudentName(studentName);
		this.setStudentNo(studentNo);
		this.setStudentSex(studentSex);
		this.setStudentAge(studentAge);
		this.setStudentSubject(studentSubject);

	}

	public String getStudentName() {
		return StudentName;
	}

	public String setStudentName(String studentName) {
		return StudentName = studentName;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentSex() {
		return studentSex;
	}

	/**
	 * 限制性别只能为男或女，反之赋值为男
	 * 
	 * @param studentSex
	 */
	public void setStudentSex(String studentSex) {
		if (studentSex == "男" | studentSex == "女") {
			this.studentSex = studentSex;
		} else {
			this.studentSex = "男";
		}
	}

	public int getStudentAge() {
		return studentAge;
	}

	/**
	 * 给年龄赋值，限定必须在10-100之间，反之赋值为18
	 * 
	 * @param studentAge 传入的年龄
	 */
	public void setStudentAge(int studentAge) {
		if (studentAge >= 10 & studentAge <= 100) {
			this.studentAge = studentAge;
		} else {
			this.studentAge = 18;
		}
	}

	/**
	 * 获取专业对象，如果没有实例化，先实例化后返回
	 * 
	 * @return
	 */
	public Subject getStudentSubject() {
		if (this.studentSubject == null) {
			this.studentSubject = new Subject();
		}
		return studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	/**
	 * 学生自我介绍的办法
	 * 
	 * @param所报专业名称
	 * @param学制年限
	 * @return学生姓名，学号，年龄，性别信息
	 */
	public String introduction() {
		String str = "学生信息如下：\n姓名" + this.getStudentName() + "\n性别" + this.getStudentSex() + "\n学号"
				+ this.getStudentNo() + "\n年龄" + this.getStudentAge() + "\n所报专业名称"
				+ this.getStudentSubject().getSubjectName() + "\n所报专业年限" + this.getStudentSubject().getSubjectLife();
		return str;
	}

	/**
	 * 学生自我介绍的办法
	 * 
	 * @param所报专业名称
	 * @param学制年限
	 * @return学生姓名，学号，年龄，性别信息
	 */
	public String introduction(String subjectName, int subjectLife) {
		String str = "学生信息如下：\n姓名" + this.getStudentName() + "\n性别" + this.getStudentSex() + "\n学号"
				+ this.getStudentNo() + "\n年龄" + this.getStudentAge() + "\n所报专业名称" + subjectName + "\n所报专业年限"
				+ subjectLife;
		return str;
	}

	/**
	 * 学生自我介绍的办法
	 * 
	 * @param所报专业名称
	 * @param学制年限
	 * @return学生姓名，学号，年龄，性别信息
	 */
	public String introduction(Subject mySubject) {
		String str = "学生信息如下：\n姓名" + this.getStudentName() + "\n性别" + this.getStudentSex() + "\n学号"
				+ this.getStudentNo() + "\n年龄" + this.getStudentAge() + "\n所报专业名称" + mySubject.getSubjectName()
				+ "\n所报专业年限" + mySubject.getSubjectLife();
		return str;
	}

}

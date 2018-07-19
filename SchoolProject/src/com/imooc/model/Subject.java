package com.imooc.model;
/**
 * 
 * @author ray
 *
 */

public class Subject {
	// 成员属性：学科名称，学科编号，学制年限
	private String subjectName;
	private String subjectNo;
	private int subjectLife;

	public Subject() {

	}

	// 带参构造实现全部赋值
	public Subject(String subjectName, String SubjectNo, int subjectLife) {
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
		 * 
		 * @return专业介绍的相关信息，包括名称，编号，年限
		 */
	public String info() {
		String str = "专业信息如下:\n专业名称" + this.getSubjectName() + "专业编号\n" + this.getSubjectNo() + "专业年限\n"
				+ this.getSubjectLife()+"年";
		return str;
	}

}

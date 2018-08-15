package com.imooc.set;

public class Student {
	private int stuId;
	private String name;
	private float score;
	public Student(int stuId,String name,float score) {
		this.score=score;
		this.stuId=stuId;
		this.name=name;
		
	}
	public Student() {
		
	}
	
	public int  getStuId() {
		return stuId;
	}
	public void setStuId(int Stuid) {
		this.stuId=Stuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(score);
		result = prime * result + stuId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}else {
		if(obj.getClass()==Student.class) {
			Student stu=(Student)obj;
			return this.getName()==stu.getName()&&this.getStuId()==stu.getStuId()&&this.getScore()==stu.getScore();
		}
		}
		return false;
	}
	public String toString() {
		String str="学号:"+this.getStuId()+"姓名："+this.getName()+"成绩"+this.getScore();
		return str;
	}
	
	
}

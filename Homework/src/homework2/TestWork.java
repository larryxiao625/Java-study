package homework2;

public class TestWork extends Work{
	int testNum;
	int bugNum;
	public TestWork() {
		
	}
	public TestWork(String name,int testnum,int bugnum) {
		this.setName(name);
		this.setTestNum(testnum);
		this.setBugNum(bugnum);
	}
	public int getTestNum() {
		return testNum;
	}
	public void setTestNum(int testNum) {
		this.testNum = testNum;
	}
	public int getBugNum() {
		return bugNum;
	}
	public void setBugNum(int bugNum) {
		this.bugNum = bugNum;
	}
	public String work() {
		String str=this.getName()+"的日报是：今天编写了"+this.getTestNum()+"个测试用例,发现了"+this.getBugNum()+"个bug";
		return str;
	}
}

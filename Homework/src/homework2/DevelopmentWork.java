package homework2;

public class DevelopmentWork extends Work{
	private int codeLine;
	private int bugNum;
	public DevelopmentWork() {
		
	}
	public DevelopmentWork(String name,int codeline,int bugnum) {
		this.setName(name);
		this.setCodeLine(codeline);
		this.setBugNum(bugnum);
	}
	public int getCodeLine() {
		return codeLine;
	}
	public void setCodeLine(int codeLine) {
		this.codeLine = codeLine;
	}
	public int getBugNum() {
		return bugNum;
	}
	public void setBugNum(int bugNum) {
		this.bugNum = bugNum;
	}
	public String work() {
		String str=this.getName()+"的日报是:今天编写了"+this.getCodeLine()+"行代码，目前仍有"+this.getBugNum()+"个bug没有解决";
		return str;
	}
	
}

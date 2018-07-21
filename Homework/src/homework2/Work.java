package homework2;

public class Work {
	private String name;
	public Work() {
		
	}
	public Work(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String work() {
		String str="快乐工作";
		return str;
	}
}

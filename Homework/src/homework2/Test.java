package homework2;

public class Test {
    public static void main(String[] args) {
    	Work work=new Work();
    	TestWork t=new TestWork("测试工作",10,5);
    	DevelopmentWork d=new DevelopmentWork("研发工作",1000,10);
		System.out.print("父类信息测试：");
		System.out.print(work.work());
		System.out.println();
		System.out.print("测试工作类信息测试：");
		System.out.print(t.work());
		System.out.println();
		System.out.print("研发工作类信息测试：");
		System.out.println(d.work());
		
	}
}

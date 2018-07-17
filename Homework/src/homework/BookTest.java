package homework;

public class BookTest {
	public static void main(String[] args) {
		Book one=new Book("红楼梦","曹雪芹");
		Book two=new Book("小李飞刀","古龙");
		one.setPublish("人民出版社");
		one.setPrice(10);
		two.setPublish("中国长安出版社");
		two.setPrice(55.5);
		one.Show();
		System.out.println("=====================");
		two.Show();
	}
}

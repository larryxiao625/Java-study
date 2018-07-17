package homework;

public class Book {
	private String name;
	private String author;
	private String publish;
	private double price;
	
	public Book(String name,String author) {
		this.name=name;
		this.author=author;
		this.price=getPrice();
		this.publish=getPublish();
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<10) {
			System.out.println("输入错误");
			this.price=10;
		}else {
		this.price = price;
		}
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	
	public void Show() {
		System.out.println("书名;"+name);
		System.out.println("作者:"+author);
		System.out.println("出版社:"+publish);
		System.out.println("价格:"+price);
	}
	
	
}

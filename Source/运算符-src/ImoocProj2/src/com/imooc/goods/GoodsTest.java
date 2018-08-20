package com.imooc.goods;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class GoodsTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Goods> set = new HashMap<Integer, Goods>();
		while (true) {
			System.out.println("请输入操作编号");
			System.out.println("1、增加商品");
			System.out.println("2、查找商品");
			System.out.println("3、修改商品信息");
			System.out.println("4、删除商品");
			System.out.println("5、展示所有商品");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("输入商品编号");
				int id = sc.nextInt();
				if (set.containsKey(id)) {
					System.out.println("商品编号已经存在，重新输入");
					break;
				}
				System.out.println("输入商品名称");
				String name = sc.next();
				System.out.println("输入商品价格");
				double price = sc.nextInt();
				Goods good = new Goods(id, name, price);
				set.put(id, good);
				break;

			case 2:
				System.out.println("请输入查找商品名称");
				String search = sc.next();
				Iterator<Goods> set1 = set.values().iterator();
				while (set1.hasNext()) {
					Goods tem = set1.next();
					if (tem.equals(search)) {
						System.out.println("商品找到啦");
						System.out.println(tem.toString());
						break;
					} else {
						System.out.println("商品未找到");
						break;
					}
				}
			case 3:
				System.out.println("输入要修改商品编号");
				int changeid = sc.nextInt();
				System.out.println("修改后的名称");
				String changename = sc.next();
				System.out.println("修改后的价格");
				double changeprice;
				try {
					changeprice = sc.nextDouble();
				} catch (java.util.InputMismatchException e) {
					System.out.println("输入数据不正确");
					continue;
				}
				set.remove(changeid);
				Goods good1 = new Goods(changeid, changename, changeprice);
				set.put(changeid, good1);
				break;
			case 4:
				System.out.println("请输入要删除的商品编号");
				int remove = sc.nextInt();
				set.remove(remove);
				break;
			case 5:
				System.out.println("全部商品有:");
				Iterator<Goods> set2 = set.values().iterator();
				while (set2.hasNext())
					System.out.println(set2.next().toString());
				break;

			}

		}

	}

}

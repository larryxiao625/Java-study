package homework;

import java.util.Scanner;

public class Homework1 {


	// 插入数据
	public int[] insertData() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println("请输入第" + (i + 1) + "个数据");
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public void showData(int[] a, int length) {
		System.out.println("数组元素为");
		for(int i:a) {
			if(i==0) {
				continue;
			}else {
				System.out.print(i+"   ");
			}
		}
		System.out.println();
	}

	public void insertAtArray(int[] a, int n, int k) {
		if (k == 10) {
			a[9] = n;
			System.out.println("数据插入成功");
		} else if (k <= 9 & k >= 1) {
			for (int i = 9; i >= k; i--) {
				int temp = 0;
				temp = a[i - 1];
				a[i] = temp;
				a[i - 1] = 0;
			}
			a[k - 1] = n;
			System.out.println("数据插入成功");
		} else {
			System.out.println("数据插入失败，请输入1-10范围内的整数");
		}
	}

	public void divThree(int[] a) {
		int m = 0;
		for (int i : a) {
			if (i % 3 == 0) {
				m++;
			} else {
				continue;
			}
		}
		if (m == 0) {
			System.out.println("没有数据能被3整除");
		} else {
			System.out.print("能被3整除的的数据有;");
			for (int i : a) {
				if (i % 3 == 0) {
					System.out.print(i + "   ");
				} else {
					continue;
				}
			}
		}
		System.out.println();
	}

	public void notice() {
		System.out.println("**********************");
		System.out.println("1--插入数据");
		System.out.println("2--显示所有数据");
		System.out.println("3--在指定位置处插入数据");
		System.out.println("4--查询能被3整除的数据");
		System.out.println("0--退出");
		System.out.println("**********************");
		System.out.print("请输入对应数字进行操作：");
	}

	public static void main(String[] args) {
		Homework1 homework = new Homework1();
		int[] arr = new int[10];
		boolean ture = true;
		while (ture) {
			homework.notice();
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if (n == 0) {
				System.out.println("程序关闭");
				System.exit(-1);
			} else {
				switch (n) {
				case 1:
					arr = homework.insertData();
					break;
				case 2:
					homework.showData(arr, 10);
					break;
				case 3:
					System.out.println("请输入插入的数");
					int m = sc.nextInt();
					System.out.println("请输入插入的位置");
					int k = sc.nextInt();
					homework.insertAtArray(arr, m, k);
					break;
				case 4:
					homework.divThree(arr);
					break;
				default:
					System.out.println("输入错误 ，请重新输入");
					break;
				}
			}

		}
	}

}

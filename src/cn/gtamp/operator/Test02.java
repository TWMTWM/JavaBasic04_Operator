package cn.gtamp.operator;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		/**
		 * 2、练习：求和
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = scan.nextInt();
		System.out.println("第一个整数：" + a);
		System.out.println("请输入第二个整数：");
		int b = scan.nextInt();
		System.out.println("第二个整数：" + b);
		int c = a + b;
		System.out.println("两个数的和是：" + c);
	}

}

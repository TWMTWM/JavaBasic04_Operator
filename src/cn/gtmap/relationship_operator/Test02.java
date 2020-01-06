package cn.gtmap.relationship_operator;

import java.util.Scanner;

public class Test02 {
	/**
	 * 练习：关系操作符
	 */
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("第一个整数：");
		int num1 = scan.nextInt();
		System.out.println("第二个整数：");
		int num2 =scan.nextInt();
		
		System.out.println("比较5>8：" + (5>8));
		System.out.println("比较5>=8：" + (5>=8));
		System.out.println("比较5<8：" + (5<8));
		System.out.println("比较5<=8：" + (5<=8));
		System.out.println("比较5==8：" + (5==8));
		System.out.println("比较5!=8：" + (5!=8));
	}
}

package cn.gtmap.ternary_operator;

import java.util.Scanner;

public class Test02 {
	/**
	 * 练习-判断是否是工作日
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("今天是周几？");
		int day = scan.nextInt();
		String status = day>=6?"周末":"工作日";
		System.out.println("今天是：" + status);
	}

}

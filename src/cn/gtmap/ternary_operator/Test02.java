package cn.gtmap.ternary_operator;

import java.util.Scanner;

public class Test02 {
	/**
	 * ��ϰ-�ж��Ƿ��ǹ�����
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������ܼ���");
		int day = scan.nextInt();
		String status = day>=6?"��ĩ":"������";
		System.out.println("�����ǣ�" + status);
	}

}

package cn.gtamp.operator;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		/**
		 * 2����ϰ�����
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("�������һ��������");
		int a = scan.nextInt();
		System.out.println("��һ��������" + a);
		System.out.println("������ڶ���������");
		int b = scan.nextInt();
		System.out.println("�ڶ���������" + b);
		int c = a + b;
		System.out.println("�������ĺ��ǣ�" + c);
	}

}

package cn.gtmap.relationship_operator;

import java.util.Scanner;

public class Test02 {
	/**
	 * ��ϰ����ϵ������
	 */
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("��һ��������");
		int num1 = scan.nextInt();
		System.out.println("�ڶ���������");
		int num2 =scan.nextInt();
		
		System.out.println("�Ƚ�5>8��" + (5>8));
		System.out.println("�Ƚ�5>=8��" + (5>=8));
		System.out.println("�Ƚ�5<8��" + (5<8));
		System.out.println("�Ƚ�5<=8��" + (5<=8));
		System.out.println("�Ƚ�5==8��" + (5==8));
		System.out.println("�Ƚ�5!=8��" + (5!=8));
	}
}

package cn.gtmap.relationship_operator;

public class Test01 {
	/**
	 * 关系操作符
	 */
	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 5;
		System.out.println(a > b);//返回false
		System.out.println(a >= c);//返回true
		
		System.out.println(a == b);//返回false
		System.out.println(a != b);//返回true
	}

}

package cn.gtamp.operator;

public class Test07 {
	/**
	 * 7、自增、自减操作符置前以及置后的区别
	 */
	public static void main(String[] args) {
		int i = 5;
		System.out.println(i++);//输出5
		System.out.println(i);//输出6
		
		int j = 5;
		System.out.println(++j);//输出6
		System.out.println(j);//输出6
	}

}

package cn.gtamp.operator;

public class Test03 {
	/**
	 * 3、任意运算单元的长度超过int
	 */
	public static void main(String[] args) {
		int a = 5;
		long b = 6;
		int c = (int) (a + b);// a+b的运算结果是long型，所以要进行强制转换
		long d = a + b;
	}
}

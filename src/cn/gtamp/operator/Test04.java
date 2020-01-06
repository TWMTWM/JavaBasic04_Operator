package cn.gtamp.operator;

public class Test04 {
	/**
	 * 4、任意运算单元的长度小于int
	 */
	public static void main(String[] args) {
		byte a = 1;
		byte b = 2;
		byte c = (byte) (a + b); // 虽然a b都是byte类型，但是运算结果是int类型，需要进行强制转换
		int d = a + b;
	}

}

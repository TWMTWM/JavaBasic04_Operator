package cn.gtamp.operator;

public class Test08 {
	/**
	 * ��ϰ������
	 */
	public static void main(String[] args) {
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++;
		System.out.println(j);//18
	}

}

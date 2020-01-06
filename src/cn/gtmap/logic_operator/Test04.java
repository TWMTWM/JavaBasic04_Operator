package cn.gtmap.logic_operator;

public class Test04 {
	/**
	 * 4、异或
	 * @param args
	 */
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		System.out.println(a^b);//不同返回真
		System.out.println(a^!b);//相同返回假
	}
}

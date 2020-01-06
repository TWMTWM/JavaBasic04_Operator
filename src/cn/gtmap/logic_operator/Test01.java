package cn.gtmap.logic_operator;

public class Test01 {
	/**
	 * 逻辑操作符
	 */
	public static void main(String[] args) {
		/**
		 * 1、长路与和短路与
		 */
		//长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
		int i = 2;
		System.out.println(i == 1 & i++ ==2);
		System.out.println(i);
		
		//短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
		int j = 2;
		System.out.println(j == 1 && j++ == 2);//因为j==1返回false,所以右边的j++就没有执行了，所以j的值，还是2
		System.out.println(j);
		
	}
}

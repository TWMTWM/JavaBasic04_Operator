package cn.gtmap.logic_operator;

import org.omg.Messaging.SyncScopeHelper;

public class Test05 {
	/**
	 * 5¡¢Á·Ï°£ºÂß¼­²Ù×÷·û
	 */
	public static void main(String[] args) {
		int i = 1;
		boolean b = !(i++ ==3)^(i++==2)&&(i++==3);
		System.out.println(b);//false
		System.out.println(i);//3
	}
	
}

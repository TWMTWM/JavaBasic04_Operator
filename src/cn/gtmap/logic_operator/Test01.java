package cn.gtmap.logic_operator;

public class Test01 {
	/**
	 * �߼�������
	 */
	public static void main(String[] args) {
		/**
		 * 1����·��Ͷ�·��
		 */
		//��·��  ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
		int i = 2;
		System.out.println(i == 1 & i++ ==2);
		System.out.println(i);
		
		//��·�� ֻҪ��һ�����ʽ��ֵ��false�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		int j = 2;
		System.out.println(j == 1 && j++ == 2);//��Ϊj==1����false,�����ұߵ�j++��û��ִ���ˣ�����j��ֵ������2
		System.out.println(j);
		
	}
}

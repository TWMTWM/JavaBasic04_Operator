package cn.gtmap.logic_operator;

public class Test02 {
	/**
	 * 2����·��Ͷ�·��
	 */
	public static void main(String[] args) {
		//��·��  ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
		int i = 2;
		System.out.println(i == 1 | i++ ==2);//�������i++���ᱻִ�У�����i��ֵ�����3
		System.out.println(i);
		
		//��·�� ֻҪ��һ�����ʽ��ֵ��true�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		int j = 2;
		System.out.println(j == 2 || j++ ==2);//��Ϊj==2����true,�����ұߵ�j++��û��ִ���ˣ�����j��ֵ������2
		System.out.println(j);
	}

}

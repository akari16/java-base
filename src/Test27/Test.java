/*
 * 	�쳣��ṹ
 * 	try catch finally������������ܵ���ʹ�ã����߿������ try catch finally try catch try finally���ֽṹ
 * 	catch��������һ�����߶����finally������һ��
 * 	try catch finally����������б�����������Ϊ������ڲ����ֱ���������ܻ������
 * 	���Ҫ������������ж����Է��ʣ�����Ҫ����������Щ�������
 * 	���catch���ʱ��ֻ��ƥ������һ���쳣�ಢִ��catch�����
 * 	��������ִ�б��catch�죬����ƥ��catch����˳�������϶���
 * */

package Test27;

public class Test {
	public static void main(String[] args) {
		try {
			String str = null;
			int len = str.length();
			int[] a = { 1, 2, 3 };
			int x = a[1];
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("��ָ���쳣");
//			System.out.println(len);
			return;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
		} finally {
			System.out.println("finally");
		}
	}
}

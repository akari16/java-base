/*
 * 	�쳣�ĸ���
 * 	�쳣��java�������ڳ��ֵĴ����磺��ָ���쳣������Խ���
 * 	java�쳣�ṩ�˴��������ڼ����Ļ��ƣ�java�쳣���������ģ����쳣�������Զ�����һ���쳣��������catch�����������쳣
 * 	
 * */
package Test25;

public class Test {
	public static void main(String[] args) {
		m1();
		System.out.println("-------�ָ���---------");

		m2();
		System.out.println("-------�ָ���1---------");
	}
	
	static void m3() {
		try {
			Class.forName("demo");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static void m2() {
		// ����Խ��
		try {
			int[] a = { 1, 2, 3 };
			int x = a[3];
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			String str = e.getMessage();
			System.out.println(str);
		}
	}

	static void m1() {
		try {
			String str = null;
			int len = str.length();
		} catch (NullPointerException e) {
			// TODO: handle exception �쳣����
			e.printStackTrace();
		}

	}
}

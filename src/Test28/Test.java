/*
 * 	�쳣�Ĵ���
 * 	�����쳣��catch
 * 	����ʹ��try catch finally �쳣������������쳣�����쳣�����ǳ�����֯��ǰ��ִ��·��
 * 	��ת��catch����ִ��
 * 
 * 	�쳣�����ط���
 * 	
 * 	catch�е��쳣������ϵͳ�Զ������������Ƿ����쳣����finally��ʼ��ִ��
 * 	�쳣�����ط���
 * 	����ʹ���쳣�����ط�����ʾ�쳣��Ϣ�����ڵ��ԣ���getMessage(), printStackTrance()��
 * 	
 * 	�׳��쳣 throws
 * 
 * 	�ڷ���������ʹ��throws�ؼ������������׳����쳣
 * 	�ڷ�����ʹ��throws�׳��쳣����
 * */
package Test28;

public class Test {
	public static void main(String[] args) {
		// m3();
		// m5();
		System.out.println("456��������������������");
	}

	static void m5() throws ClassNotFoundException {
		Class.forName("Demo");
	}

	static void m1() {
		try {
			String str = null;
			int len = str.length();
			System.out.println("123.........");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally...");
		}
	}

	static void m2() {
		m1();
	}

	static void m3() {
		m2();
	}
}

package Test5.java;

public class Test5 {
	public static void main(String[] args) {
		// System.out.println("111");
		Test5.printStart(2);
		Test5 test5 = new Test5();
		test5.m1();
		
		int s = sum();
		System.out.println(s);
		
	}
	
	//����������   ϵͳ�ķ�����������
	static int sum() {
		int i = 1;
		int j = 2;
		return i + j;
	}

	static int sum(int i, int j) {
		return i + j;
	}

	// ��static�ؼ��ֵķ�����Ϊ��̬�����������෽��
	// main��֮Ϊ������
	static void printStart(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("*");
		}
	}

	// ʵ���������Ǿ�̬����
	void m1() {
		System.out.println("1");
	}
}
//��������ŵ�������ȥ���壬���ܵ������壬��������ķ�װ��
//��������

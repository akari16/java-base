package Test12;

//��������

public class Dog extends Animal {
	// �����ĸ��ǣ�����������һ���͸���ͬ������override overwrite
	// ���������أ�ͬһ�������棬����������ͬ�������ĸ����������Ͳ�ͬ
	@Override
	public void run() {
		super.run();	//���ø��෽������ִ�и��෽��
		System.out.println("dog run-------");
	}

}

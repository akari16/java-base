package Test8;

public class Test9 {
	public static void main(String[] args) {
		//һ����ֻ�ܴ���һ������
		//����ֱ��new����
		// Demo d = new Demo();
		
		Demo d1 = Demo.getInstance();
		Demo d2 = Demo.getInstance();
		System.out.println(d1==d2);
	}
}

//����ģʽ
class Demo{
	//���췽����˽�е�
	private Demo() {
		
		
	}
	
	private static Demo instance;
	public static Demo getInstance() {
		if(instance == null) {
			//�Լ�ʵ�����Լ�
			instance = new Demo();
		}
		return instance;
	}
}
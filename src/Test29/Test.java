/*
 * 	�Զ����쳣
 * 	����һ���ಢ����exception
 * 	ʹ��throw�ؼ��֣��ڷ��������׳��쳣����
 * 	ʹ��throws�ؼ��� �ڷ����������׳��쳣
 * */
package Test29;

public class Test {
	public static void main(String[] args) {
		Pan p = new Pan(550);
		try {
			p.use();
		} catch (PanExp e) {
			e.printStackTrace();
		}
	}
}

class PanExp extends Exception {
	int p;

	public PanExp(int p, String name) {
		super(name);
		this.p = p;
	}

	public int getP() {
		return p;
	}
}

class Pan {
	int p;

	public Pan(int p) {
		this.p = p;
	}

	public void use()throws PanExp{
		if(p>500) {
			throw new PanExp(p,"ѹ��̫��");
		}
		System.out.println("������������������");
	}
}

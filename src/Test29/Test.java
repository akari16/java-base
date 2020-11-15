/*
 * 	自定义异常
 * 	定义一个类并集成exception
 * 	使用throw关键字，在方法体中抛出异常对象
 * 	使用throws关键字 在方法声明中抛出异常
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
			throw new PanExp(p,"压力太高");
		}
		System.out.println("正常运作。。。。。");
	}
}

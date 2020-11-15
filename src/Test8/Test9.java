package Test8;

public class Test9 {
	public static void main(String[] args) {
		//一个类只能创建一个对象
		//不能直接new对象
		// Demo d = new Demo();
		
		Demo d1 = Demo.getInstance();
		Demo d2 = Demo.getInstance();
		System.out.println(d1==d2);
	}
}

//单例模式
class Demo{
	//构造方法是私有的
	private Demo() {
		
		
	}
	
	private static Demo instance;
	public static Demo getInstance() {
		if(instance == null) {
			//自己实例化自己
			instance = new Demo();
		}
		return instance;
	}
}
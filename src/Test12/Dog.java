package Test12;

//方法覆盖

public class Dog extends Animal {
	// 方法的覆盖，子类里面有一个和父类同名方法override overwrite
	// 方法的重载，同一个类里面，方法名称相同，参数的个数或者类型不同
	@Override
	public void run() {
		super.run();	//调用父类方法，先执行父类方法
		System.out.println("dog run-------");
	}

}

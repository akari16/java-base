/*
 * 接口的实现
 * 使用implements关键字实现接口
 * 一个类实现接口必须实现接口中的所有方法
 * 一个类可以实现多个接口
 * 接口可以实现堕胎，是设计系统的灵魂
 * 
 */

package Test19;

public class Test {
	public static void main(String[] args) {
		// 多个类可以实现同一个接口
		Computer c = new Computer();
		c.read();
		c.write();

		Mobile m = new Mobile();
		m.read();
		m.write();
		// 一个类可以实现多可以接口
		m.playMp3();
	}
}

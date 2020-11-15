/**
 * 内部类
 * 定义在一个类内部的类叫做内部类，包含内部类的类成为外部类
 * 内部类可以声明public protected private等访问限制，可以声明为abstract的供其它内部类或者外部类继承与扩展
 * 或者声明为static final的，也可以实现特定的接口
 * static的内部类行为上像一个独立的类，非static在行为上类似类的属性或者方法且禁止生命static的方法
 * 内部类可以访问外部类的所有方法与属性，但是static的内部类只能访问外部类的静态属性与方法
 * 
 * 内部类的分类:静态内部类，实例内部类，局部内部类，匿名内部类
 */

package Test21;

public class Test {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.StaticClass sic = new OuterClass.StaticClass();

		OuterClass.InnerClass ic = oc.new InnerClass();

		USB u = new USB() {

			@Override
			public void read() {
				// TODO Auto-generated method stub

			}

			@Override
			public void write() {
				// TODO Auto-generated method stub

			}
		};

		Animal a = new Animal() {

			@Override
			void run() {
				// TODO Auto-generated method stub
				System.out.println("run");
			}
		};
		a.run();
	}
}

abstract class Animal {
	abstract void run();
}

//class Computer implements USB{}

interface USB {
	public void read();

	public void write();
}
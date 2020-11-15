/*	Set接口
 * 	特性
 * 	继承collection,但是不允许重复使用，使用自己内部的一个排列机制，Set机制接口没有引入新方法
 * 	所以Set就是一个Collection,只不过其行为不同
 * 	HashSet
 * 	是最常用的，查询速度最快，因为内部以HashMap来实现，所以插入元素不能保持插入次序，
 * 	创建您自己的要添加到HashSet类时，别忘了覆盖hashCode()和equals
 * 	当两个对象的equals方法返回true时，这两个对象的hashCode应该相等
 * 	对象中用作equals比较标准的属性，都应该用来计算hashCode值
 * */
package Test32;

public class Test {
	public static void main(String[] args) {

	}
}

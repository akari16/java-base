/*	集合中的常用接口
 * 	collection
 * 	一组允许重复的对象
 * 	List
 * 	继承collection，允许重复，以元素安插的次序来放置元素，不会重新排列
 * 	Set
 * 	继承collection，但不允许重复，使用自己内部的一个排列机制
 * 	Map
 * 	是一组成对的 键/值  即持有的是   key - value 对，Map中不能有重复的key，拥有自己内部的排列机制
 * 
 * 	对List的选择
 * 	1.对于随机查询与迭代遍历操作，数组比所有的容器都要快
 * 	2.从中间的为止插入和删除元素，LinkedList要比ArrayList快，特别是删除操作
 * 	3.Vector通常不如ArrayList快，则且应该避免使用，它目前仍然存在于类库中的原因是为了支持过去的代码
 * 	4.最佳实践,将ArrayList作为默认首选，只有当程序的性能因为经常从list中间进行插入和删除而变差的时候
 *	才去选择LinkedList 当然了，如果只是使用固定数量的元素，就应该选择数组了 		
 * */
package Test31;

public class Test {

	public static void main(String[] args) {

	}

}

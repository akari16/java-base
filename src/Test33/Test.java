/*	Map�ӿ�
 * 	��������һ�� ��-ֵ ���󣬼������е��� key - value��
 * 	Map�в������ظ���key��ӵ���Լ��ڲ������л���
 * 	
 * 	HashMap�Թ�ϣ�����ݽṹʵ�֣����Ҷ���ʱͨ����ϣ����������λ�ã�����Ϊ���ٲ�ѯ����Ƶģ�
 * 	���ڲ�������һ��hash�����飨empty[] table����Ԫ�ػ�ͨ����ϣת��������Ԫ�صĹ�ϣ��ַת���������д�ŵ�����
 * 	����г�ͻ����ʹ��ɢ���������ʽ��������ͬ��ϣ��ַ��Ԫ�ش�����������ͨ���鿴HashMap entry��Դ����	
 * 	��һ��������ṹ
 * 	map��ѡ��
 * 	Hashtable��HashMapЧ�ʴ�����ͬ��ͨ��HashMap����һ�㣬����HashMap����ȡ��HashTable��
 * 	TreeMapͨ����HashMap������ΪҪά������
 * 	HashMap����Ϊ�����������Ƶ�
 * 	LinkedHashMap��HashMap��һ�㣬��Ϊ��ά��ɢ�����ݽṹ��ͬ�»���ά������
 * */
package Test33;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test {
	public static void main(String[] args) {
		test2();
	}

	static void test1() {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("0", "a");
		hm.put("1", "b");
		hm.put("2", "c");
		hm.put("2", "c1");
		String v1 = hm.get("1");
		System.out.println(v1);

		// ѭ������
		Set<String> keys = hm.keySet();
		for (String key : keys) {
			String value = hm.get(key);
			System.out.println(key + ":" + value);
		}
	}

	static void test2() {
		TreeMap<String, String> tm = new TreeMap<String, String>();
		tm.put("0", "a");
		tm.put("1", "b");
		tm.put("2", "c");
		tm.put("3", "d");
		System.out.println(tm);
	}

}

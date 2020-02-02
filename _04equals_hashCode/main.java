package _04equals_hashCode;

import java.util.HashMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		//1 hashMap
		Map<String, Student> map = new HashMap<>();
		map.put("a", new Student("Xiao Ming"));
		map.put("b", new Student("Xiao Hong"));
		map.put("c", new Student("Xiao Jun"));
		map.get("a"); // Student("Xiao Ming")
		map.get("x"); // null
		// HashMap֮�����ܸ���keyֱ���õ�value��ԭ�������ڲ�ͨ���ռ任ʱ��ķ�������һ��������洢����value��������keyֱ�Ӽ����valueӦ�ô洢���ĸ�����
		// ���key��ֵΪ"a"������õ�����������1����˷���valueΪPerson("Xiao Ming")�����key��ֵΪ"b"������õ�����������5����˷���valueΪPerson("Xiao Hong")���������Ͳ��ر����������飬����ֱ�Ӷ�ȡkey��Ӧ��value��
		// ������ʹ��key��ȡvalue��ʱ�򣬾ͻ�����һ�����⣺
		// ���Ƿ���Map��key���ַ���"a"�����ǣ������ǻ�ȡMap��valueʱ������ı�����һ�����Ƿ�����Ǹ�key����
		// ���仰��������keyӦ����������ͬ������һ����ͬһ������
		String key1 = "a";
        Map<String, Integer> map1 = new HashMap<>();
        map1.put(key1, 123);

        String key2 = new String("a");
        map1.get(key2); // 123

        System.out.println(key1 == key2); // false
        System.out.println(key1.equals(key2)); // true
		// ��Ϊ��Map���ڲ�����key���Ƚ���ͨ��equals()ʵ�ֵģ���һ���List����Ԫ����Ҫ��ȷ��дequals()��һ���ģ�����ȷʹ��Map���뱣֤����Ϊkey�Ķ��������ȷ��дequals()������
        // ���Ǿ���ʹ��String��Ϊkey����ΪString�Ѿ���ȷ��д��equals()��������������Ƿ����key��һ���Լ�д���࣬�ͱ��뱣֤��ȷ��д��equals()������
        // ������˼��һ��HashMapΪʲô��ͨ��keyֱ�Ӽ����value�洢����������ͬ��key����ʹ��equals()�ж�ʱ����true������Ҫ�������ͬ��������������ͬ��keyÿ��ȡ����value�Ͳ�һ���ԡ�
        // ͨ��key���������ķ�ʽ���ǵ���key�����hashCode()������������һ��int������HashMap����ͨ���������ֱ�Ӷ�λkey��Ӧ��value���������̶�ֱ�ӷ���value
        // ��ˣ���ȷʹ��Map���뱣֤:
        /*
	              ��Ϊkey�Ķ��������ȷ��дequals()��������ȵ�����keyʵ������equals()���뷵��true��
	
			��Ϊkey�Ķ��󻹱�����ȷ��дhashCode()��������hashCode()����Ҫ�ϸ���ѭ���¹淶��
			
			�������������ȣ������������hashCode()������ȣ�
			�������������ȣ������������hashCode()������Ҫ��ȡ�
			����Ӧ����ʵ��a��b��
			
			���a��b��ȣ���ôa.equals(b)һ��Ϊtrue����a.hashCode()�������b.hashCode()��
			���a��b����ȣ���ôa.equals(b)һ��Ϊfalse����a.hashCode()��b.hashCode()������Ҫ��ȡ�
			������һ���淶����ȷ�ԣ����뱣֤ʵ�֣�����HashMap��������������
			
			���ڶ�������������㣬����Ա�֤��ѯЧ�ʣ���Ϊ��ͬ�Ķ������������ͬ��hashCode()�������Map�ڲ��洢��ͻ��ʹ��ȡ��Ч���½�
         * 
         */
        // ��Person���дequals������HashMap����
		
	}
	
}

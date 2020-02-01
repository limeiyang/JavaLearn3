package _03Map;

import java.util.HashMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		//1 Map�ĸ�Ч��ѯ
		Student s =new Student("Xiao Ming", 99);
		Map<String, Student> map = new HashMap<>();
		map.put("Xiao Ming", s); // ��"Xiao Ming"��Studentʵ��ӳ�䲢����
		Student target = map.get("Xiao Ming"); // ͨ��key���Ҳ�����ӳ���Studentʵ��
        System.out.println(target == s); // true��ͬһ��ʵ��
        System.out.println(target.getScore()); // 99
        Student another = map.get("Bob"); // ͨ����һ��key����
        System.out.println(another); // δ�ҵ�����null
        
        //2 Map���
        // ��List���� MapҲ��һ���ӿڣ���õ�ʵ������HashMap��
        // ���ֻ�����ѯĳ��key�Ƿ���ڣ����Ե���boolean containsKey(K key)������
        // ��������ڴ洢Mapӳ���ϵ��ʱ�򣬶�ͬһ��key��������put()�������ֱ���벻ͬ��value������ʲô�����أ�
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 123);
        map1.put("pear", 456);
        System.out.println(map1.get("apple")); // 123
        map1.put("apple", 789); // �ٴη���apple��Ϊkey����value��Ϊ789
        System.out.println(map1.get("apple")); // 789
		// Map�в������ظ���key����Ϊ������ͬ��key��ֻ���ԭ�е�key-value��Ӧ��value���滻����
        // ����value���ظ�
        
        //3 ����Map
        // ��Map��˵��Ҫ����key����ʹ��for eachѭ������Mapʵ����keySet()�������ص�Set���ϣ����������ظ���key�ļ���
        Map<String, Integer> map11 = new HashMap<>();
        map11.put("apple", 123);
        map11.put("pear", 456);
        map11.put("banana", 789);
        for (String key : map11.keySet()) {
            Integer value = map11.get(key);
            System.out.println(key + " = " + value);
        }
        // ͬʱ����key��value����ʹ��for eachѭ������Map�����entrySet()���ϣ�������ÿһ��key-valueӳ��
        Map<String, Integer> map111 = new HashMap<>();
        map111.put("apple", 123);
        map111.put("pear", 456);
        map111.put("banana", 789);
        for (Map.Entry<String, Integer> entry : map111.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        // ����Mapʱ�����ɼ��������key������ģ�
	}
}

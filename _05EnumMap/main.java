package _05EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		// HashMap��һ��ͨ��key����hashCode()��ͨ���ռ任ʱ��ķ�ʽ��ֱ�Ӷ�λ��value���ڵ��ڲ��������������ˣ�����Ч�ʷǳ��ߡ�
		// �����Ϊkey�Ķ�����enum���ͣ���ô��������ʹ��Java���Ͽ��ṩ��һ��EnumMap�������ڲ���һ���ǳ����յ�����洢value�����Ҹ���enum���͵�keyֱ�Ӷ�λ���ڲ������������������Ҫ����hashCode()������Ч����ߣ�����û�ж���Ŀռ��˷ѡ�
		Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "����һ");
        map.put(DayOfWeek.TUESDAY, "���ڶ�");
        map.put(DayOfWeek.WEDNESDAY, "������");
        map.put(DayOfWeek.THURSDAY, "������");
        map.put(DayOfWeek.FRIDAY, "������");
        map.put(DayOfWeek.SATURDAY, "������");
        map.put(DayOfWeek.SUNDAY, "������");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
        
        // ʹ��EnumMap��ʱ������������Map�ӿ�������������ˣ�ʵ���ϰ�HashMap��EnumMap�������ڿͻ��˿���û���κ�����
	}
	
	enum DayOfWeek{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
}

package _07Properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// ��ȡ�����ļ�
public class Main {
	public static void main(String[] args) {
		//1 Properties ���
		// �ڱ�дӦ�ó����ʱ�򣬾�����Ҫ��д�����ļ������磬�û�������
		/*
		 *  # �ϴ����򿪵��ļ�:
			last_open_file=/data/hello.txt
			# �Զ������ļ���ʱ����:
			auto_save_interval=60
		 */
		// �����ļ����ص��ǣ�����Key-Valueһ�㶼��String-String���͵ģ����������ȫ������Map<String, String>����ʾ����
		// ��Ϊ�����ļ��ǳ����ã�����Java���Ͽ��ṩ��һ��Properties����ʾһ�顰���á���������ʷ����ԭ��Properties�ڲ���������һ��Hashtable��������ֻ��Ҫ�õ�Properties������ڶ�д���õĽӿڡ�
		
		//2 ��ȡ�����ļ�
		// ��Properties��ȡ�����ļ��ǳ��򵥡�JavaĬ�������ļ���.propertiesΪ��չ����ÿ����key=value��ʾ����#�ο�ͷ����ע�͡�������һ�����͵������ļ���
		/*
		 *  # setting.properties

			last_open_file=/data/hello.txt
			auto_save_interval=60
		 */
		// 2.1 ����Propertiesʵ��
		String f = "setting.properties";
		Properties props = new Properties();
		// 2.2 ����load()��ȡ�ļ�
		try {
			props.load(new java.io.FileInputStream(f));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2.3 ����getProperty()��ȡ����
		String filepath = props.getProperty("last_open_file");
		String interval = props.getProperty("auto_save_interval", "120");
		
		/// δ����� ---
		// https://www.liaoxuefeng.com/wiki/1252599548343744/1265119084411136
	}
}

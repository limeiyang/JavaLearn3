package _07Properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// 读取配置文件
public class Main {
	public static void main(String[] args) {
		//1 Properties 简介
		// 在编写应用程序的时候，经常需要读写配置文件。例如，用户的设置
		/*
		 *  # 上次最后打开的文件:
			last_open_file=/data/hello.txt
			# 自动保存文件的时间间隔:
			auto_save_interval=60
		 */
		// 配置文件的特点是，它的Key-Value一般都是String-String类型的，因此我们完全可以用Map<String, String>来表示它。
		// 因为配置文件非常常用，所以Java集合库提供了一个Properties来表示一组“配置”。由于历史遗留原因，Properties内部本质上是一个Hashtable，但我们只需要用到Properties自身关于读写配置的接口。
		
		//2 读取配置文件
		// 用Properties读取配置文件非常简单。Java默认配置文件以.properties为扩展名，每行以key=value表示，以#课开头的是注释。以下是一个典型的配置文件：
		/*
		 *  # setting.properties

			last_open_file=/data/hello.txt
			auto_save_interval=60
		 */
		// 2.1 创建Properties实例
		String f = "setting.properties";
		Properties props = new Properties();
		// 2.2 调用load()读取文件
		try {
			props.load(new java.io.FileInputStream(f));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2.3 调用getProperty()获取配置
		String filepath = props.getProperty("last_open_file");
		String interval = props.getProperty("auto_save_interval", "120");
		
		/// 未完待续 ---
		// https://www.liaoxuefeng.com/wiki/1252599548343744/1265119084411136
	}
}

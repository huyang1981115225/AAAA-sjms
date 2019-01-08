package chuangjianxing.day01_singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试反序列化会破解单例模式
 * 
 * @author HY
 * 
 */
public class SingletonDemo9 implements Serializable {

	private static final long serialVersionUID = -8429485903424181114L;
	
	private static SingletonDemo9 instance;

	private SingletonDemo9() {

	}

	public static synchronized SingletonDemo9 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo9();
		}
		return instance;
	}
	
	/**
	 *以下可以防止反序列化破解单例模式 
	 */
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
	
	/**
	 * 测试反序列化破解单例模式
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		SingletonDemo9 s1 = SingletonDemo9.getInstance();
		SingletonDemo9 s2 = SingletonDemo9.getInstance();
		System.out.println("s1:  " + s1);
		System.out.println("s2:  " + s2);
		System.out.println(s1 == s2);

		// 序列化对象
		FileOutputStream fos = new FileOutputStream("E:/宽连十方/工作记录/设计模式/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();

		// 反序列化对象
		FileInputStream fis = new FileInputStream("E:/宽连十方/工作记录/设计模式/a.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SingletonDemo9 s3 = (SingletonDemo9) ois.readObject();
		ois.close();
		fis.close();
		System.out.println("s3:  " + s3);
		System.out.println(s3 == s1);// true
	}
}

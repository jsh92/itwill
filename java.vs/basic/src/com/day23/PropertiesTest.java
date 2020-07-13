package com.day23;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		//Properties - HashMap의 구버전인 Hashtable을 상속한 클래스
		//(key, value) => (String, String) 으로 단순화한 형태
		//환경설정등에 주로 사용
		//파일로부터 값을 읽어서 저장 가능
		
		Properties props = new Properties();
		
		props.setProperty("size", "10");
		props.setProperty("timeout", "30");
		props.setProperty("capacity", "100");
		props.setProperty("language", "kr");
		
		Enumeration en = props.propertyNames();
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String val = props.getProperty(key);
			System.out.println("key="+key+", value="+val);
		}
		
		//값 변경
		props.setProperty("size", "20");
		
		//public String getProperty(String key,String defaultValue)
		String value = props.getProperty("capacity", "10");
		System.out.println("\ncapacity => "+value);
		System.out.println("lang=> "+ props.getProperty("lang", "java"));
		System.out.println("size=> "+ props.getProperty("size"));
		
		System.out.println("\n요소의 개수 : "+props.size()); //4
	}

}

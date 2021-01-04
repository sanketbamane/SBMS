package com.ashokit;

import java.lang.reflect.Field;

public class MyApp {

	public static void main(String[] args) throws Exception {

		Class clz = Class.forName("com.ashokit.User");
		Object obj = clz.newInstance();

		Field declaredField = clz.getDeclaredField("name");
		declaredField.setAccessible(true);
		declaredField.set(obj, "Ashok");
		System.out.println(declaredField.get(obj));

		// ------------------------------------------//

		Field field2 = clz.getDeclaredField("reportDao");
		field2.setAccessible(true);
		field2.set(obj, new ReportDao());
		System.out.println(field2.get(obj));
	}

}

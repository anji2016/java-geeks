package com.java.basics.gc;

public class MetaSpaceDemo {
	static javassist.ClassPool cp = javassist.ClassPool.getDefault();

	public static void main(String args[]) throws Exception {
		System.out.println("start");
		for (int i = 0; i < 10000000; i++) {
			Class c = cp.makeClass("com.java.basics.gc.MetaSpaceDemo" + i).toClass();
		}
		System.out.println("done");
	}
	
	/*-XX:MetaspaceSize=40m
-XX:MaxMetaspaceSize=1024m
-Xms512M
-Xmx8192M*/

}

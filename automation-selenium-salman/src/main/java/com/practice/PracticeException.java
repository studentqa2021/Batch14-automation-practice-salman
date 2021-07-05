package com.practice;

public class PracticeException {
	static int a=10;
public static void getexception(){
	System.out.println("hi all");
	System.out.println("smart tech");
	try {
	System.out.println(10/0);
	}catch(Exception e) {
		//e.printStackTrace();
	}
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("hallo");
}

}

package com.practice;

public class PracticeStringLooping {
	static String name="smart";
public static void getlooping(){
//	System.out.println(name);
//	System.out.println(name.length());
//	System.out.println(name.charAt(4));
// for(int i=0;i<=(name.length()-1);i++) {
//	System.out.println(name.charAt(i));
// }
	for(int i=(name.length()-1);i>=0;i--) {
		System.out.print(name.charAt(i));
	}
}	

	public static void  getrevers(String name){
		StringBuilder obj =new StringBuilder(name);
		System.out.println("");
		System.out.println(obj.reverse());
	}
}


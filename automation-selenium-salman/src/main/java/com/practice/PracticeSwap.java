package com.practice;

import java.util.Arrays;

public class PracticeSwap {
	
public static void getswap(int a,int b){
	System.out.println("a value before swap="+a);
	System.out.println("b value before swap="+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a value after swap="+a);
	System.out.println("b value after swap="+b);
	
	int[] c= {10,20,30};
	System.out.println(Arrays.toString(c));
}
	
}



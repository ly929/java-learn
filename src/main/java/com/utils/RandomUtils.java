package com.utils;

import java.util.Random;

public class RandomUtils {

	
	public static char nextChar(){
		return (char)('a'+Math.random()*('z'-'a'+1));
	}
	
	public static int nextInt(int i){
		Random ran=new Random();
		return ran.nextInt(i);
	}
	
	public static int nextInt3(){
		Random ran=new Random();
		return ran.nextInt(1000);
	}
	
	public static int nextInt8(){
		Random ran=new Random();
		return ran.nextInt(100000000);
	}
	
	public static int nextInt6(){
		Random ran=new Random();
		return ran.nextInt(1000000);
	}
	
	public static void main(String[] args) {
		nextChar();
		System.out.println("产生一个随机整数:"+nextInt8());  
		System.out.println("产生一个随机整数:"+nextInt6()); 
		System.out.println(nextInt3());
	}
}

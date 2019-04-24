package com.utils;

public class UUIDUtils {

	
	/**
	 * 获得字符型UUID
	 * @return
	 */
	public static String getUUID() {
		
		java.util.UUID uuid = java.util.UUID.randomUUID();  

		return uuid.toString();
    }  
	
	/**
	 * 获得不带'-'的字符型UUID
	 * @return
	 */
	public static String getUUID32() {
		
		java.util.UUID uuid = java.util.UUID.randomUUID();  
        String str = uuid.toString();  
        // 去掉"-"符号  
        return str.substring(0, 8) + str.substring(9, 13) 
        		+ str.substring(14, 18) + str.substring(19, 23) + str.substring(24);  
    }  

	public static void main(String[] args) {
		System.out.println(getUUID32());
	}
}

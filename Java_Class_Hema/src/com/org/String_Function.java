package com.org;

public class String_Function {
	public static void main(String[] args) {
		
		String s= "Mohammed Yousuf Imthiyaz";
		String s1= "mohammed yousuf Imthiyaz";
		String s3= "";
		String s4 = "        mohammed yousuf imthiyaz";
		
		int length = s.length();
		System.out.println(length);
		
		char charAt = s.charAt(23);		
		System.out.println(charAt);
		
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("M");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("z");
		System.out.println(endsWith);
		
		boolean contains = s.contains("mm");
		System.out.println(contains);
		
		int indexOf = s.indexOf("h");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("t");
		System.out.println(lastIndexOf);
		
		String replace = s.replace("ous", "OUS");
		System.out.println(replace);

		String substring = s.substring(1);
		System.out.println(substring);
		
		String substring2 = s.substring(3, 14);
		System.out.println(substring2);
		
		boolean empty = s3.isEmpty();
		System.out.println(empty);
		
		String trim = s4.trim();
		System.out.println(trim);
		
		String[] split = s.split("  ");
		for (String str : split) {
			System.out.println(str);
			
		}
		
		
		
	}
	

}

package myproject;

public class string_handling_manipulation {
	public static void main(String args[]) {
		String str="hello this is java class";
		String str1="hello";
		String str2="HeLLO";
		String str3="hi how are you";
		String str4="hello";
		String str5="1234";
		String str6="Java234";
		String str7="";
		String str9="   hello java   ";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str.charAt(7));
		System.out.println(str1.compareTo(str4));//return integer, 0 if string equal else return diff of ascii value of first missmatch
		System.out.println(str1.compareToIgnoreCase(str2));//returns integer, ignores the case(upper or lower) here missmatch checks with alphabet
		System.out.println(str1.concat(str3));
		System.out.println(str1.contains("hel"));//returns boolean
		System.out.println(str1.contentEquals(str4));//returns boolean
		System.out.println(str1.endsWith("lo"));//returns boolean
		System.out.println(str1.equals(str3));
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.matches("[a-zA-Z]+"));
		System.out.println(str5.matches("[a-zA-Z]+"));
		System.out.println(str6.matches("[a-zA-Z]+"));
		System.out.println(str1.matches("[a-zA-Z0-9]+"));
		System.out.println(str5.matches("[a-zA-Z0-9]+"));
		System.out.println(str5.matches("\\d+"));//matches only numeric values
		System.out.println(str6.matches("[a-zA-Z]+\\d+"));//matches alphanumeric
		System.out.println(str7.isEmpty());//returns boolean
		System.out.println(String.join("@",str2,str3,str5));
		System.out.println(String.join(";","hello","hi","how r u "));
		System.out.println(str1.lastIndexOf('l'));
		System.out.println(str1.replace("ll", "paa"));
		System.out.println(str.replaceFirst("is", "si"));
		String str8[]=str3.split(" ");
		for(String i:str8) {
			System.out.println(i);
		}
		String str10="hi;how;r;u";
		String str11[]=str10.split(";");
		for(String i:str11) {
			System.out.println(i);
		}
		System.out.println(str6.startsWith("J"));//returns boolean
		System.out.println(str.subSequence(5,13));//return value is string
		char arr[]=str4.toCharArray();
		System.out.println(arr[0]);
		System.out.println(str9.trim());
		System.out.println(String.valueOf(3.45f));
		System.out.println(String.valueOf(1f));
		
			
		
		
		
	}
}

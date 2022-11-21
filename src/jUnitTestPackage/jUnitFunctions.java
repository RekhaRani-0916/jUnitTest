package jUnitTestPackage;


public class jUnitFunctions {
	public static int addint(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public static String addString(String a, String b) {
		String c = a+b;
		return c;
	}
	
	public static void main(String [] args) {
		System.out.println(addString("hello","world"));
		System.out.println(addint(1, 2));
	}
	
	 

}

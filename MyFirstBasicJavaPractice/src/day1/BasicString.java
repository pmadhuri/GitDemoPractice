package day1;

public class BasicString {

	public static void main(String[] args) {
		String a="madhuri";
		String reverse="";
		
		for(int i=a.length()-1;i>=0;i--) {

			reverse=reverse+a.charAt(i);
		}
		System.out.println("reverse String: "+reverse);
	}

}

public class Palindrome {
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("KaYak"));
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("car"));		

	}	

 private static boolean isPalindrome(String str) {
	
	String reverse = "";
	
	int length = str.length();
	
	for(int i = length - 1 ; i >= 0; i--) {
		
		 reverse += str.charAt(i);
		
	}
	
	return str.equalsIgnoreCase(reverse);	
	}

}
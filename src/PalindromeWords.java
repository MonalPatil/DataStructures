import java.util.Arrays;

/* Given the string consisting of multiple elements check
  weather each element is palindrome or not return the array of words which are palindrome 
  Interview Question -Coupa Software*/
public class PalindromeWords {
public static void main(String[] args) {
		
		
		String input = "test toot poop loop lol";
		String[] result = checkPalindrome(input);
		// TODO Auto-generated method stub
		
		for(String s: result) {
			System.out.println(s);
		}

	}
	
	
	public static String[] checkPalindrome(String str) {
		
		String[] arr = str.split("\\s+");
		String[] result = new String[arr.length];
		int i=0;
		for(String s: arr) {
			if(checkPalindromeword(s)) {
				result[i]= s;
				i++;
			}
		}
		
		return Arrays.copyOf(result, i);
	}
	
	
	public static boolean checkPalindromeword(String word) {
		int i=0;
		int j= word.length()-1;
		
		while(i<j) {
			if(word.charAt(i)!=word.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
	}
}

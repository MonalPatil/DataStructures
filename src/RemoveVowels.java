/*
 * Given a string S, remove the vowels 
 * 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
 */
public class RemoveVowels {
	
	 public String removeVowels(String S) {
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<S.length();i++){
	            if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
	            {
	                //Do nothing
	            }
	            else{
	                sb.append(S.charAt(i));
	            }
	        }
	       return sb.toString(); 
	    }

}

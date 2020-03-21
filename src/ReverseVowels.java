/*
 * Write a function that takes a string as input and reverse only the vowels of a string.
 * example: Input: "hello"   Output: "holle"
 */
public class ReverseVowels {
	
	 public String reverseVowels(String s) {
	        
	        char[] arr = s.toCharArray();
	        int i=0;
	        int j= arr.length-1;
	        
	        while(i<j){
	            
	            if(!isVowel(arr[i]) && !isVowel(arr[j])){
	                i++;
	                j--;
	            }
	            else if(!isVowel(arr[i])){
	                i++;
	            }
	            else if(!isVowel(arr[j])){
	                j--;
	            }
	            else{
	                char temp = arr[i];
	                arr[i]= arr[j];
	                arr[j]= temp;
	                i++;
	                j--;
	                
	            }
	            
	    }  
	                   
	    return String.valueOf(arr);               
	        
	    }
	    
	    public boolean isVowel(Character c){
	        //boolean bool = false; 
	        String strvowel = "aeiouAEIOU";
	        
	        if(strvowel.indexOf(c)!=-1){
	            return true;
	        }
	        
	       return false; 
	    }

}

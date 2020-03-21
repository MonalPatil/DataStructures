/*
 * Given an array A of positive integers, let S be the sum of the digits of the minimal element of A.
 * Return 0 if S is odd, otherwise return 1
 * example  Input: [34,23,1,24,75,33,54,8] output:0 
 * explanation: The minimal element is 1, and the sum of those digits is S = 1 which is odd, so the answer is 0.
 *
 *
 *Input : [99,77,33,66,55] output :1 
 *The minimal element is 33, and the sum of those digits is S = 3 + 3 = 6 which is even, so the answer is 1.
 *
 */
public class sumOfDigitsInMinArrayElement {
	
	public int sumOfDigits(int[] A) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<A.length;i++){
            if(A[i]<min){
                min= A[i];
            }
            
        }
        
        int sum =0;
        while(min!=0){
            sum = sum +min%10;
            min = min/10;
        }
        
        if(sum%2==0){
            return 1;
        }
        else{
            return 0;
        }
        
        
        
    }

}

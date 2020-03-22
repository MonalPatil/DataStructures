import java.util.Arrays;

/*
 * Decompress Run-Length Encoded List
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
 * Return the decompressed list.
 * 
 * Input: nums = [1,2,3,4]  Output: [2,4,4,4]
 * Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
 * The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 * At the end the concatenation [2] + [4,4,4] is [2,4,4,4].
 * 
 */
public class DecompressArray {
	
	 public int[] decompressRLElist(int[] nums) {
	        /*LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
	        //MultiMap<Integer,Integer> mmap =  LinkedHashMultiMap.create();
	        
	        
	        for(int i=0;i<nums.length-1;i= i+2){
	            map.put(nums[i+1],nums[i]);
	        }
	        int size =0;
	        for(Map.Entry<Integer,Integer> e: map.entrySet()){
	           size = size+ e.getValue(); 
	        }
	        
	        int[] result = new int[size];
	        int j=0;
	        for(Map.Entry<Integer,Integer> e: map.entrySet()){
	            int count = e.getValue();
	            while(count!=0){
	                result[j]=e.getKey();
	                j++;
	                count--;
	            }    
	        }
	        
	        return result;*/
	        int count =0;
	        
	        for( int i=0; i<nums.length;i= i+2){
	            count = count+ nums[i];
	        }
	        
	        int[] result = new int[count];
	        
	        int index= 0;
	        for(int i=0;i<nums.length;i=i+2){
	            Arrays.fill(result,index, index+nums[i],nums[i+1]);
	            index = index+nums[i];
	    
	            
	        }
	        
	        return result;
	    }

}

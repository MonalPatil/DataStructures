import java.util.Arrays;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * @author mpatil
 * 
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * Note: You are not suppose to use the library's sort function for this problem.
 *
 *
 *Input: [2,0,2,1,1,0]
 *Output: [0,0,1,1,2,2]
 */
public class SortColors {
	
public void sortColors(int[] nums) {
        
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        
        for(int i=0; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int index =0;
        
        for(Entry<Integer, Integer> e: map.entrySet()){
            Arrays.fill(nums,index,index+e.getValue(),e.getKey());
            index = index + e.getValue();
            
        }
        
    }

}
